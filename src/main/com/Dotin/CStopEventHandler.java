package com.Dotin;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler
        implements ApplicationListener<ContextStoppedEvent> {

    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("Context_Stopped_Event received!!!");
    }
}

/*
Spring provides the following standard events:
 ContextRefreshedEvent
 ContextStartedEvent
 ~> ContextStoppedEvent
 ContextClosedEvent
 RequestHandledEvent

Listening to Context Events:
    To listen to a context event, a bean should implement the ApplicationListener
     interface which has just one method onApplicationEvent().
 */