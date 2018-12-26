package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Injecting Inner Beans
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}

/*
   Java inner classes are defined within the scope of other classes,
    similarly, inner beans are beans that are defined within the scope of
     another bean.
      Thus, a <bean/> element inside the <property/> or <constructor-arg/>
       elements is called inner bean
 */