package org.example;

import org.example.model.Car;

public class DesignPatten {
    public static void main(String[] args) {

        //Car object with required parameters and a color which is an optional parameter.
        new Car.Builder("1", "Toyota","SUV")
                .setColor("Red")
                .build();

        //Car object with color and size
        new Car.Builder("1", "Toyota","SUV")
                .setColor("Red")
                .setSize(5)
                .build();

    }
}