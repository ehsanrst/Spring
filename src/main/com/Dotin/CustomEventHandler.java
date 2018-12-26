package com.Dotin;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}

/*
A published event can be handled in a class, let us say EventClassHandler
 which implements "ApplicationListener" interface and implements onApplicationEvent
  method for the custom event.
 */