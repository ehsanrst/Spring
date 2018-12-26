package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Annotation Based Configuration
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }
}
/*
  @Required
    The @Required annotation applies to bean property setter methods.
     and it indicates that the affected bean property must be populated in
      XML configuration file at configuration time.
       Otherwise, the container throws a BeanInitializationException exception.
 */
