package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Java Based Configuration
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello Datin!");
        helloWorld.getMessage();
    }
}

/*
Java-based configuration option enables you to write most of your Spring configuration
 without XML but with the help of few Java-based annotations.

Once your configuration classes are defined,
 you can load and provide them to Spring container
  using "AnnotationConfigApplicationContext".

**HINT:
    The @Import annotation allows for loading
     @Bean definitions from another configuration class.

     @Configuration
     public class ConfigA {
       @Bean
       public A a() {
         return new A();
       }
     }

   You can import above Bean declaration in another Bean Declaration as follows
    @Configuration
    @Import(ConfigA.class)
    public class ConfigB {
       @Bean
       public B a() {
          return new A();
       }
     }
    Now, rather than needing to specify both ConfigA.class and ConfigB.class
     when instantiating the context, only ConfigB needs to be supplied as follows

     public static void main(String[] args) {
        ApplicationContext ctx =
                       new AnnotationConfigApplicationContext(ConfigB.class);

        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);
     }

    now both beans A and B will be available...

**Lifecycle Callbacks:
    The @Bean annotation supports specifying arbitrary initialization
     and destruction callback methods, much like Spring XML's init-method
      and destroy-method attributes on the bean element

      public class Foo {
         public void init() {
         // initialization logic
        }
         public void cleanup() {
         // destruction logic
        }
     }

     @Configuration
     public class AppConfig {
        @Bean(initMethod = "init", destroyMethod = "cleanup" )
        public Foo foo() {
            return new Foo();
       }
     }

**Specifying Bean Scope:
     The default scope is singleton,
      but you can override this with the @Scope annotation as follows

      @Configuration
      public class AppConfig {
         @Bean
         @Scope("prototype")
         public Foo foo() {
            return new Foo();
        }
      }
 */
