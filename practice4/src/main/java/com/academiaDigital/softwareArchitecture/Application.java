package com.academiaDigital.softwareArchitecture;
import com.academiaDigital.softwareArchitecture.factory.IAbstractFactory;

public class Application {
    IAbstractFactory abstractFactory;

    public Application(IAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void populateRace(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("Creating " + i+ " "+  abstractFactory.createRace());
        }

    }

    public void generateRaceHouse(){
            System.out.println("Creating " +  abstractFactory.createRaceHouse());

    }
    public void buildCity(){
            System.out.println("Creating " +  abstractFactory.createRaceCity());
    }
}
