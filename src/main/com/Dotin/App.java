package com.Dotin;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Log4j
 */
public class App {
    static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        log.info("Going to create HelloSpring Object!");
        HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
        obj.getMessage();

        log.info("Exiting the Program.");
    }
}

/*
We need create  log4j.properties which defines the standard rules required
 for Log4J to produce log messages in resource directory.
 */
