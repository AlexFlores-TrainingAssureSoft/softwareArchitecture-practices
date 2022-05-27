package com.academiaDigital.softwareArchitecture;

import com.academiaDigital.softwareArchitecture.factory.ElfFactory;
import com.academiaDigital.softwareArchitecture.factory.IAbstractFactory;
import com.academiaDigital.softwareArchitecture.factory.OrcFactory;

public class main {
    public static void main(String[] args) {
        IAbstractFactory abstractFactory = new OrcFactory();
        Application application = new Application(abstractFactory);

        application.populateRace();
        application.buildCity();
        application.generateRaceHouse();

        IAbstractFactory abstractFactory1 = new ElfFactory();
        Application application2 = new Application(abstractFactory1);

        application2.populateRace();
        application2.buildCity();
        application2.generateRaceHouse();
    }
}
