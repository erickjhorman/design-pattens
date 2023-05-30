package org.example.interfaces.implementation;

import org.example.interfaces.AbstractFactory;
import org.example.interfaces.domain.Theme;
import org.example.interfaces.domain.WhiteAnimation;
import org.example.interfaces.domain.WhiteTheme;

public class WhiteThemeFactory implements AbstractFactory {

    public WhiteThemeFactory() {
        applyStyles();
        addChatAnimations();
    }

    @Override
    public Theme applyStyles() {
        System.out.println("Visual styles in White");
        return new WhiteTheme();
    }

    @Override
    public WhiteTheme addChatAnimations() {
        System.out.println("Add animation in White");
        return new WhiteAnimation();
    }
}
