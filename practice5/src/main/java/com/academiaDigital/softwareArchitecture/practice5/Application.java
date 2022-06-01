package com.academiaDigital.softwareArchitecture.practice5;

import com.academiaDigital.softwareArchitecture.practice5.builder.RocketBuilder;
import com.academiaDigital.softwareArchitecture.practice5.builder.SpaceStationBuilder;
import com.academiaDigital.softwareArchitecture.practice5.director.Director;
import com.academiaDigital.softwareArchitecture.practice5.products.Rocket;
import com.academiaDigital.softwareArchitecture.practice5.products.SpaceStation;

public class Application {
    public static void main(String[] args) {
        RocketBuilder rocketBuilder = new RocketBuilder();
        Director rocketDirector = new Director(rocketBuilder);
        rocketDirector.constructRocket();
        Rocket rocket = rocketBuilder.getRocket();

        SpaceStationBuilder spaceStationBuilder = new SpaceStationBuilder();
        Director spaceStationDirector = new Director(spaceStationBuilder);
        spaceStationDirector.constructSpaceStation();
        SpaceStation spaceStation = spaceStationBuilder.getSpaceStation();
    }
}
