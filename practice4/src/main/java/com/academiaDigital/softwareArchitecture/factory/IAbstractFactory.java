package com.academiaDigital.softwareArchitecture.factory;
import com.academiaDigital.softwareArchitecture.product.IRace;
import com.academiaDigital.softwareArchitecture.product.IRaceCity;
import com.academiaDigital.softwareArchitecture.product.IRaceHouse;

public interface IAbstractFactory {
    IRace createRace();
    IRaceCity createRaceCity();
    IRaceHouse createRaceHouse();
}
