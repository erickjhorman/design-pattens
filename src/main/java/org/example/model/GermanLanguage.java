package org.example.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GermanLanguage implements Interpreter {

    private String name;
    @Override
    public String name() {
        return name;
    }
}
