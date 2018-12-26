package com.Dotin;

public class App {
    public static void main(String[] args) {

    }
}

/*
The Spring container can autowire relationships between collaborating beans
 without using <constructor-arg> and <property> elements, which helps cut down
  on the amount of XML configuration you write for a big Spring-based application.

Autowiring Modes:
    1. no :
    This is default setting which means no autowiring and you should use
     explicit bean reference for wiring. You have nothing to do special for
      this wiring. This is what you already have seen in Dependency Injection
       chapter.

    2. byName :
    Autowiring by property name. Spring container looks at the properties
     of the beans on which autowire attribute is set to byName in the XML
      configuration file. It then tries to match and wire its properties with
       the beans defined by the same names in the configuration file.

    3. byType :
    Autowiring by property dataType. Spring container looks at the properties
     of the beans on which autowire attribute is set to byType in the XML
      configuration file. It then tries to match and wire a property if its
       type matches with exactly one of the beans name in configuration file.
        If more than one such beans exists, a fatal exception is thrown.

    4. constructor :
    Similar to byType, but type applies to constructor arguments.
     If there is not exactly one bean of the constructor argument type in the
      container, a fatal error is raised.

    5. autodetect :
    Spring first tries to wire using autowire by constructor, if it does not
     work, Spring tries to autowire by byType.

hint : You can use byType or constructor autowiring mode to wire arrays and other typed-collections.
        Autowiring works best when it is used consistently across a project.

Limitations :
    1. Overriding possibility :
        You can still specify dependencies using <constructor-arg> and <property>
         settings which will always override autowiring.

    2. Primitive data types :
        You cannot autowire so-called simple properties such as primitives,
         Strings, and Classes.

    3. Confusing nature :
        Autowiring is less exact than explicit wiring, so if possible prefer
         using explicit wiring.
 */
