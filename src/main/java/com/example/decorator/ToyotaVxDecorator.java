package com.example.decorator;

import com.example.interfaces.LandCruiser;

public class ToyotaVxDecorator extends LandCruiserDecorator {

    public ToyotaVxDecorator(LandCruiser landCruiser) {
        super(landCruiser);
    }

    @Override
    public String name() {
        return "ToyotaVxDecorator";
    }

    public int getEngine() {
        return landCruiser.getEngine();
    }

    public boolean isSafetySense(){
        return true;
    }

    public boolean isLightLed() {
        return true;
    }

    @Override
    public String toString() {
        return "ToyotaVxDecorator " + " name: " + name() + "\n" +
                " isSafetySense: " + isSafetySense() + "\n" +
                " isLightLed: " + isLightLed() + "\n" +
                " getEngine: " + landCruiser.getEngine();
    }
}