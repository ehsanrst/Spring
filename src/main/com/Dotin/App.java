package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Java Based Configuration
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello Datin!");
        helloWorld.getMessage();
    }
}

/*
Java-based configuration option enables you to write most of your Spring configuration
 without XML but with the help of few Java-based annotations.

Once your configuration classes are defined,
 you can load and provide them to Spring container
  using "AnnotationConfigApplicationContext".
 */
