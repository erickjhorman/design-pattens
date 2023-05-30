package org.example.interfaces.implementation;

import org.example.interfaces.AbstractFactory;
import org.example.interfaces.domain.*;

public class BlackThemeFactory implements AbstractFactory {

    public BlackThemeFactory() {
        applyStyles();
        addChatAnimations();
    }

    @Override
    public Theme applyStyles() {
        System.out.println("Visual styles in Black");

        return new BlackTheme();
    }

    @Override
    public BlackTheme addChatAnimations() {
        System.out.println("Add animation in Black");
        return new BlackAnimation();
    }
}
