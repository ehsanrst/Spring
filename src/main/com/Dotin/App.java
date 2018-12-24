package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellChek();
    }
}

/*
   Setter-based DI is accomplished by the container calling setter methods on
    your beans after invoking a no-argument constructor or no-argument static factory method
     to instantiate your bean.
 */