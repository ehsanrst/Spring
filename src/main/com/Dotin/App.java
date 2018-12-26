package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}

/*
Autowiring Modes:
    3. byType :
    Autowiring by property_dataType. Spring container looks at the properties
     of the beans on which autowire attribute is set to byType in the XML
      configuration file. It then tries to match and wire a property if its
       type matches with exactly one of the beans name in configuration file.
        If more than one such beans exists, a fatal exception is thrown.

        For example :
         if a bean definition is set to autowire byType in the configuration file,
          and it contains a 'spellChecker' property of "SpellChecker type", Spring looks
           for a bean definition named "SpellChecker", and uses it to set the property.
 */
