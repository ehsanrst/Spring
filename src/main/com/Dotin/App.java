package com.Dotin;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Event Handling
 */
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        // Let us raise a stop event.
        context.stop();
    }
}

/*
You have seen that the core of Spring is the ApplicationContext,
 which manages the complete life cycle of the beans.
  The ApplicationContext publishes certain types of events when loading
   the beans. For example, a ContextStartedEvent is published when the context
    is started and ContextStoppedEvent is published when the context is stopped.

     Event handling in the ApplicationContext is provided through the
      ApplicationEvent class and ApplicationListener interface.
       Hence, if a bean implements the ApplicationListener, then every time
        an ApplicationEvent gets published to the ApplicationContext,
         that bean is notified.

Spring provides the following standard events:
 ContextRefreshedEvent
 ContextStartedEvent
 ContextStoppedEvent
 ContextClosedEvent
 RequestHandledEvent

Spring's event handling is single-threaded so if an event is published,
 until and unless all the receivers get the message, the processes are
  blocked and the flow will not continue.

Listening to Context Events:
    To listen to a context event, a bean should implement the ApplicationListener
     interface which has just one method onApplicationEvent().
 */