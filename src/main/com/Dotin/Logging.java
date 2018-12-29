package com.Dotin;

public class Logging {
    //This method we would like to execute Before a selected method execution
    public void beforeAdvice() {
        System.out.println("Going to setup student profile...");
    }

    //This method we would like to execute After a selected method execution
    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }

    //This method we would like to execute when any method return
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning: " + retVal.toString());
    }

    //This method we would like to execute if there is an exception raised
    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}
