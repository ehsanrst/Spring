package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Constructor-Base
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}

/*
Autowiring Modes:
    4. constructor :
    Similar to byType,
     but type applies to constructor arguments.
     If there is not exactly one bean of the constructor argument type
      in the container, a fatal error is raised.
 */
