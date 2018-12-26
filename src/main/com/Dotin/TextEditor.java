package com.Dotin;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;

    public TextEditor() {
        System.out.println("Inside TextEditor constructor.");
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
/*
You can use @Autowired annotation on properties to get rid of the setter methods.
 When you will pass values of autowired properties using <property>
  Spring will automatically assign those properties with the passed values
   or references.
 */
