package com.Dotin;

/**
 * Annotation Based Configuration
 */
public class App {
    public static void main(String[] args) {

    }
}
/*
Instead of using XML to describe a bean wiring, you can move the bean configuration
 into the component class itself by using annotations on the relevant class,
  method, or field declaration.

Annotation injection is performed before XML injection.
 Thus, the latter configuration will override the former for properties wired
  through both approaches.

Annotation wiring is not turned on in the Spring container by default.
 So, before we can use annotation-based wiring, we will need to enable it
  in our Spring configuration file.

a few important annotations:
  @Required
    The @Required annotation applies to bean property setter methods.

  @Autowired
    The @Autowired annotation can apply to bean property setter methods,
     non-setter methods, constructor and properties.

  @Qualifier
    The @Qualifier annotation along with @Autowired can be used to remove
     the confusion by specifying which exact bean will be wired.

  JSR-250 Annotations
    Spring supports JSR-250 based annotations which include @Resource,
     @PostConstruct and @PreDestroy annotations.
 */
