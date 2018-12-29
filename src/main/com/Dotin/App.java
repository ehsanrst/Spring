package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Aspect oriented programming (AOP)
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
 /*
Aspects Implementation:
    	XML Schema based:
    	    Aspects are implemented using the regular classes
    	     along with XML based configuration.
  */
