package com.Dotin;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean Life Cycle
 * there are lists of the activities that take place behind the scene
 * between the time of bean Instantiation and its destruction
 */
public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        context.registerShutdownHook();
        /* declared on the AbstractApplicationContext class.
           This will ensure a graceful shutdown and call the
           relevant destroy methods so resources are released.*/
    }
}