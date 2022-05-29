package com.academiaDigital.softwareArchitecture.practice5.parts;

public class Engine {
    private double volume;
    private String fuel;

    public Engine(double volume, String fuel) {
        this.volume = volume;
        this.fuel = fuel;
    }

    public double getVolume() {
        return volume;
    }

    public String getFuel() {
        return fuel;
    }
}
