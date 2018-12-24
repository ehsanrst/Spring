package com.Dotin;

public class App {
    public static void main(String[] args) {

    }
}

/*
When writing a complex Java application, application classes should be
 as independent as possible of other Java classes to increase the possibility
  to reuse these classes and to test them independently of other classes while
   unit testing.
    Dependency Injection (or sometime called wiring) helps in gluing these
     classes together and at the same time keeping them independent.

Consider you have an application which has a text editor component and you
 want to provide a spell check:

 public class TextEditor {
   private SpellChecker spellChecker;

   public TextEditor() {
      spellChecker = new SpellChecker();
   }
}

What we've done here is, create a dependency between the TextEditor and the
 SpellChecker. In an inversion of control scenario, we would instead do something
  like this:

  public class TextEditor {
   private SpellChecker spellChecker;

   public TextEditor(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }
}

Here, the TextEditor should not worry about SpellChecker implementation.
 The SpellChecker will be implemented independently and will be provided to
  the TextEditor at the time of TextEditor instantiation.
   This entire procedure is controlled by the Spring Framework.

   Dependency Injection Type:
   1.Constructor-based dependency injection
    Constructor-based DI is accomplished when the container invokes a class constructor
     with a number of arguments, each representing a dependency on the other class.

   2.Setter-based dependency injection
    Setter-based DI is accomplished by the container calling setter methods on
     your beans after invoking a no-argument constructor or no-argument static
      factory method to instantiate your bean.

      It is a good to use constructor arguments for mandatory dependencies
       and setters for optional dependencies.
 */