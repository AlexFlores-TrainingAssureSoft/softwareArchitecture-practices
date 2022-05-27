package com.academiaDigital.softwareArchitecture;

import com.academiaDigital.softwareArchitecture.factory.IAbstractFactory;

public class Application {
    IAbstractFactory abstractFactory;

    public Application(IAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void populateRace(){
        abstractFactory.createRace();
    }

    private void generateRaceHouse(){
        abstractFactory.createRaceHouse();
    }
    private void buildCity(){
        abstractFactory.createRaceCity();
    }
}
