package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean Definition Inheritance
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();

        HelloIran objB = (HelloIran) context.getBean("helloIran");
        objB.getMessage1();
        objB.getMessage2(); //will inherit from parent
        objB.getMessage3();
    }
}