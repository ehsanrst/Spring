package com.Dotin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Jakarta Commons Logging (JCL) API
 */
public class App {
    static Log log = LogFactory.getLog(App.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        log.info("Going to create HelloSpring Object!");
        HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
        obj.getMessage();

        log.info("Exiting the Program.");
    }
}

/*
Alternatively you can use Jakarta Commons Logging (JCL) API to generate
 a log in your Spring application.

 We need to add commons-logging dependency.
 */
