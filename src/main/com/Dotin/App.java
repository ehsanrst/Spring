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
        student.getName();
        student.getAge();
    }
}
/*
  @Autowired
    The @Autowired annotation can apply to bean property setter methods,
     non-setter methods, constructor and properties.
      The @Autowired annotation can be used to autowire bean on the setter method
       just like @Required annotation, constructor, a property or methods
        with arbitrary names and/or multiple arguments.
 */
