package com.Dotin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("Your Message : " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}

/*
To define the setup and teardown for a bean, we simply declare the <bean>
 with init-method and/or destroy-method parameters.
  The init-method attribute specifies a method that is to be called on
   the bean immediately upon instantiation.
    Similarly, the destroy-method specifies a method that is called
     just before a bean is removed from the container.

You can use @PostConstruct annotation as an alternate of initialization callback
 and @PreDestroy annotation as an alternate of destruction callback.
 */