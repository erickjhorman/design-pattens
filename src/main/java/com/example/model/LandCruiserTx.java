package com.example.model;

import com.example.interfaces.LandCruiser;

public class LandCruiserTx implements LandCruiser {

    @Override
    public String name() {
        return "LandCruiserTx";
    }

    public int getEngine(){
        return 2800;
    }

    @Override
    public String toString() {
        return "LandCruiserTx " + "name: " + name() + "\n" +
                "getEngine: " + getEngine();
    }
}
