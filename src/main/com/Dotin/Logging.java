package com.Dotin;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
    /*definition for a pointcut to select all the methods available.
       So advice will be called for all the methods.
        The actual body of the pointcut_method is irrelevant and in fact
         should be empty.
     */
    @Pointcut("execution(* com.Dotin.*.*(..))") // expression
    private void selectAll() {
    } // signature

    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("Going to setup student profile...");
    }

    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }

    @AfterReturning(pointcut = "selectAll()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning: " + retVal.toString());
    }

    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}

/*
Hint: You can define a pointcut inline for any of the advices:
    @Before("execution(* com.Dotin.*.*(..))")
    public doBeforeTask(){
       ...
    }
 */
