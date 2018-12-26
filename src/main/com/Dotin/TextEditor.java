package com.Dotin;

public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    // a setter method to inject the dependency
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker!");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
