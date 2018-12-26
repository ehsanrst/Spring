package com.Dotin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}

/*
Annotating a class with the @Configuration indicates that the class can be
 used by the Spring IoC container as a source of bean definitions.
  The @Bean annotation tells Spring that a method annotated with @Bean
   will return an object that should be registered as a bean in the Spring
    application context.

    Here, the method name is annotated with @Bean works as "bean ID" and
     it creates and returns the actual bean.
      Your configuration class can have a declaration for more than one @Bean.
 */