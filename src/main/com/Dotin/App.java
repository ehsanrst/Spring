package com.Dotin;

/**
 * Aspect oriented programming (AOP)
 */
public class App {
    public static void main(String[] args) {

    }
}
 /*
 Aspect-Oriented Programming entails breaking down program logic into
  distinct parts called so-called concerns.
   The functions that span multiple points of an application are called
    cross-cutting concerns and these cross-cutting concerns are conceptually
     separate from the application's business logic.
      There are various common good examples of aspects like
       logging, auditing, declarative transactions, security, caching, etc.

The key unit of modularity in OOP is the class,
 whereas in AOP the unit of modularity is the aspect.
  Dependency Injection helps you decouple your application objects from each other
   and AOP helps you decouple cross-cutting concerns from the objects that
    they affect.

AOP concepts and terminology:
1.Aspect
    This is a module which has a set of APIs providing cross-cutting requirements.
     For example, a logging module would be called AOP aspect for logging.
      An application can have any number of aspects depending on the requirement.

2.Join point
    This represents a point in your application where you can plug-in the AOP aspect.
     You can also say, it is the actual place in the application where an action
      will be taken using Spring AOP framework.

3.Advice
    This is the actual action to be taken either before or after the method execution.
     This is an actual piece of code that is invoked during the program execution
      by Spring AOP framework.

      Types of Advice:{
      1.before
        Run advice before the a method execution.

      2.after
        Run advice after the method execution, regardless of its outcome.

      3.after-returning
        Run advice after the a method execution only if method completes successfully.

      4.after-throwing
        Run advice after the a method execution only if method exits by throwing an exception.

      5.around
        Run advice before and after the advised method is invoked.
      }

4.Pointcut
    This is a set of one or more join points where an advice should be executed.
     You can specify pointcuts using expressions or patterns.

5.Introduction
    An introduction allows you to add new methods or attributes to the existing
     classes.

6.Target object
    The object being advised by one or more aspects.
     This object will always be a proxied object, also referred to as the advised object.

7.Weaving
    Weaving is the process of linking aspects with other application types
     or objects to create an advised object.
      This can be done at compile time, load time, or at runtime.

Aspects Implementation:
    	XML Schema based
    	@AspectJ based
  */
