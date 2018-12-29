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
    	@AspectJ based:
    	 @AspectJ refers to a style of declaring aspects as regular Java classes
    	  annotated with Java 5 annotations.
*/
