package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Injecting Bean Dependencies
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.spellCheck();
    }
}

/*
When @Beans have dependencies on one another, expressing that the dependency
 is as simple as having one bean method calling another.
 */