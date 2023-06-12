package org.example.model;

import java.util.List;

public class InterpreterAdapterImpl implements InterpreterAdapter {

    private List<String> languages;
    private final Interpreter interpreter;

    public InterpreterAdapterImpl(Interpreter interpreter) {
        languages = List.of("Spanish");
        this.interpreter = interpreter;
    }

    @Override
    public void translate() {
        System.out.println("translating from " + interpreter.name());
        languages.forEach(language -> System.out.println("translating to " + language));
    }
}
