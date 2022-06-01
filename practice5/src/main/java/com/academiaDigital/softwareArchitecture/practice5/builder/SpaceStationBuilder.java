package com.academiaDigital.softwareArchitecture.practice5.builder;

import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;
import com.academiaDigital.softwareArchitecture.practice5.products.SpaceStation;

public class SpaceStationBuilder implements IBuilder{
    private int numberOfEngines;
    private Engine engine;
    @Override
    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines=numberOfEngines;
    }

    @Override
    public void setEngine(Engine setEngine) {
        this.engine=setEngine;
    }

    public SpaceStation getSpaceStation(){
        return new SpaceStation(this.numberOfEngines,this.engine,5,2);
    }
}
