package com.Dotin;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }
}

/*
Create an event class, CustomEvent by extending "ApplicationEvent".
 This class must define a default constructor which should inherit constructor
  from ApplicationEvent class.
 */