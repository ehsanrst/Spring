package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean Scopes (singleton)
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.setMessage("I'm Object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
        //if scope define as prototype result will be null for objB
    }
}

/*
  singleton:
  This scopes the bean definition to a single instance per Spring
  IoC container (default).
  <p>
  prototype:
  This scopes a single bean definition to have any number of object instances.
  <p>
  request:
  This scopes a bean definition to an HTTP request. Only valid in the context
  of a web-aware Spring ApplicationContext.
  <p>
  session:
  This scopes a bean definition to an HTTP session. Only valid in the context
  of a web-aware Spring ApplicationContext.
  <p>
  global-session:
  This scopes a bean definition to a global HTTP session. Only valid in the context
  of a web-aware Spring ApplicationContext.
  */
