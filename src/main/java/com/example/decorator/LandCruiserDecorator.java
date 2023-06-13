package com.example.decorator;

import com.example.interfaces.LandCruiser;

public abstract class LandCruiserDecorator implements LandCruiser {

    protected LandCruiser landCruiser;

    public LandCruiserDecorator(LandCruiser landCruiser) {
        this.landCruiser = landCruiser;
    }

    public int getEngine() {
        return landCruiser.getEngine();
    }

    @Override
    public String toString() {
        return  " name: " + landCruiser.name() + "\n" +
                " getEngine: " + landCruiser.getEngine();
    }

}
