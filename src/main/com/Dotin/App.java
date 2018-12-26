package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Annotation Based Configuration
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}

