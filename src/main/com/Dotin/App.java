package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}

/*
Autowiring Modes:
    2. byName :
    Autowiring by property_name. Spring container looks at the properties
     of the beans on which autowire attribute is set to byName in the XML
      configuration file. It then tries to match and wire its properties with
       the beans defined by the same names in the configuration file.
       If matches are found, it will inject those beans. Otherwise, bean(s)
        will not be wired.

        For example,
         if a bean definition is set to autowire byName in the configuration file,
          and it contains a spellChecker property (that is, it has a setSpellChecker(...)method),
           Spring looks for a bean definition named spellChecker, and uses it to
            set the property.
 */
