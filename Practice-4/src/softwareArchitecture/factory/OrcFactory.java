package com.academiaDigital.softwareArchitecture.factory;

import com.academiaDigital.softwareArchitecture.product.*;

public class OrcFactory implements IAbstractFactory {
    @Override
    public IRace createRace() {
        return new Orc();
    }

    @Override
    public IRaceCity createRaceCity() {
        return new OrcCity();
    }

    @Override
    public IRaceHouse createRaceHouse() {
        return new OrcHouse();
    }
}
