package com.academiaDigital.softwareArchitecture.practice5.builder;

import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;
import com.academiaDigital.softwareArchitecture.practice5.products.Rocket;

public class RocketBuilder implements IBuilder{
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
    public Rocket getRocket(){
        return new Rocket(this.numberOfEngines,this.engine);
    }

}
