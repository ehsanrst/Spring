package com.Dotin;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }
}

/*
Once your event class is defined, you can publish it from any class,
 let us say EventClassPublisher which implements "ApplicationEventPublisherAware".
  You will also need to declare this class in XML configuration file as a bean
   so that the container can identify the bean as an event publisher because
    it implements the ApplicationEventPublisherAware interface.
 */