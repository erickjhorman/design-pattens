package com.example;

import com.example.decorator.ToyotaTxlDecorator;
import com.example.decorator.ToyotaVxDecorator;
import com.example.model.LandCruiserTx;

public class DecoratorDesign {
    public static void main(String[] args) {
        var landCruiserTx = new LandCruiserTx();
        System.out.println(landCruiserTx);

        var landCruiserTXL = new ToyotaTxlDecorator(landCruiserTx);
        System.out.println(landCruiserTXL);

        var landCruiserVX = new ToyotaVxDecorator(landCruiserTXL);
        System.out.println(landCruiserVX);

    }
}
