package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * You need to create a Beans.xml Configuration file which acts as a cement
 * that glues the beans, i.e. the classes together.
 * This file needs to be created under the src directory
 */
public class App {
    public static void main(String[] args) {
        //Spring ApplicationContext Container (IoC)
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //ClassPathXmlApplicationContext() This API loads beans configuration file
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        //getBean() This method uses bean ID to return a generic object
        obj.getMessage();
    }

    /**
     * The ApplicationContext container includes all functionality of the
     * BeanFactoryContainer, so it is generally recommended over BeanFactory.
     *
     * The objects that form the backbone of your application and that are
     * managed by the Spring IoC container are called beans.
     *
     * Spring IoC container is totally decoupled from the format in which
     * this configuration metadata is actually written.
     *
     * three important methods to provide configuration metadata:
     * XML based configuration file,
     * Annotation-based configuration,
     * Java-based configuration.
     */
}
