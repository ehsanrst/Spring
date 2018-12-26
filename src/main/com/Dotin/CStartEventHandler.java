package com.Dotin;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler
        implements ApplicationListener<ContextStartedEvent> {

    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("Context_Started_Event Received...");
    }
}

/*
Spring provides the following standard events:
 ContextRefreshedEvent
~> ContextStartedEvent
 ContextStoppedEvent
 ContextClosedEvent
 RequestHandledEvent

Listening to Context Events:
    To listen to a context event, a bean should implement the ApplicationListener
     interface which has just one method onApplicationEvent().
 */