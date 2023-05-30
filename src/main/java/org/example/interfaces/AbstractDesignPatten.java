package org.example.interfaces;

import org.example.interfaces.implementation.BlackThemeFactory;
import org.example.interfaces.implementation.WhiteThemeFactory;

public class AbstractDesignPatten {
    public static void main(String[] args) {
        //We're going to instance white theme in whatsapp
        System.out.println("User changing to white theme");
        new WhiteThemeFactory();
        System.out.println("\n");
        //now user wants to use black theme
        System.out.println("User changing to Black theme");
        new BlackThemeFactory();
    }
}
