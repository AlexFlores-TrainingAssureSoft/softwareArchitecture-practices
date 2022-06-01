package com.academiaDigital.softwareArchitecture.practice5.director;

import com.academiaDigital.softwareArchitecture.practice5.builder.IBuilder;
import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;

public class Director {
    IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public void constructRocket(){
        this.builder.setEngine(new Engine(10000,"Hydrogen"));
        this.builder.setNumberOfEngines(3);
    }

    public void constructSpaceStation(){
        this.builder.setEngine(new Engine(20000000,"Kerosene"));
        this.builder.setNumberOfEngines(56);
    }
}
