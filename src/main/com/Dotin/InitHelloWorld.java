package com.Dotin;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("BeforeInitialization : " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("AfterInitialization : " + beanName);
        return bean;
    }
}

/*
The BeanPostProcessor interface defines callback methods

The BeanPostProcessors operate on bean instances (or object instances),
 which means that the Spring IoC container instantiates a bean instance
  and then BeanPostProcessor interfaces do their work.

We can configure multiple BeanPostProcessor interfaces and can control
 the order in which these BeanPostProcessor interfaces execute by setting
  the order property provided the BeanPostProcessor implements the Ordered
   interface.

ApplicationContext automatically detects any beans that are defined with the
 implementation of the BeanPostProcessor interface and registers these beans
  as PostProcessors
 */