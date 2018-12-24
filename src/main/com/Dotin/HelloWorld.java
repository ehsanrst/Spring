package com.Dotin;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /*The init-method specifies a method that is to be called on
      the bean immediately upon instantiation.*/
    public void init() {
        System.out.println("Bean is going through init.");
    }

    /*The destroy-method specifies a method that is called just
      before a bean is removed from the container.*/
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}

/*
Initialization callbacks:
we could implement InitializingBean interface and initialization
work can be done inside afterPropertiesSet() method Instead of  init method
with XML-based configuration metadata.

Destruction callbacks:
we could implement DisposableBean interface and initialization
work can be done inside destroy() method Instead of destroy() method
with XML-based configuration metadata.
 */