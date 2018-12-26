package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Injecting Collection (injecting Bean References)
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");

        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
    }
}

/*
what if you want to pass plural values like Java Collection types such as
 List, Set, Map, and Properties.
  To handle the situation, Spring offers four types of collection configuration
   elements which are as follows:
    <list> : helps in wiring ie injecting a list of values, allowing duplicates.
    <set> : helps in wiring a set of values but without any duplicates.
    <map> : can be used to inject a collection of name-value pairs where name and value can be of any type.
    <props> : can be used to inject a collection of name-value pairs where the name and value are both Strings.

    hint: You will come across two situations
     (a) Passing direct values of the collection and
     (b) Passing a reference of a bean as one of the collection elements.
 */