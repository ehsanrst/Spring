package com.Dotin;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

/*
You can use @Autowired annotation on setter methods to get rid of
 the <property> element in XML configuration file.
  When Spring finds an @Autowired annotation used with setter methods,
   it tries to perform "byType" autowiring on the method.
 */