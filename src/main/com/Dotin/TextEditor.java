package com.Dotin;

import javax.annotation.Resource;

public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Resource(name = "spellChecker")
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

/*
We can use @Resource annotation on fields or setter methods
 and it works the same as in Java EE 5.
  The @Resource annotation takes a 'name' attribute which will be interpreted
   as the bean_name to be injected.
   (We can say, it follows "byName" autowiring semantics)

hint:
    If no 'name' is specified explicitly, the default name is derived
     from the field name or setter method.
      In case of a field, it takes the field name;
       in case of a setter method, it takes the bean property name.
 */