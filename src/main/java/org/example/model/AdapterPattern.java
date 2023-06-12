package org.example.model;

public class AdapterPattern {
    public static void main(String[] args) {
        EnglishLanguage english = new EnglishLanguage("English");

        InterpreterAdapter interpreterAdapter = new InterpreterAdapterImpl(english);
        interpreterAdapter.translate();


        System.out.println(" ");
        GermanLanguage german = new GermanLanguage("German");
        InterpreterAdapter interpreterAdapter1 = new InterpreterAdapterImpl(german); //you can use singleton to return only one instance
        interpreterAdapter1.translate();

    }
}
