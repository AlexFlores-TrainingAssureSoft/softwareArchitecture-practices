package com.academiaDigital.softwareArchitecture.factory;

import com.academiaDigital.softwareArchitecture.product.IRace;
import com.academiaDigital.softwareArchitecture.product.IRaceCity;
import com.academiaDigital.softwareArchitecture.product.IRaceHouse;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcFactoryTest {

    @Test
    public void createRace_should_return_elf() {
        OrcFactory orcFactory = new OrcFactory();
        //Act
        IRace result = orcFactory.createRace();
        //Assert
        assertNotNull(result);
    }

    @Test
    public void createRaceCity_should_return_city() {
        OrcFactory orcFactory = new OrcFactory();
        //Act
        IRaceCity result = orcFactory.createRaceCity();
        //Assert
        assertNotNull(result);
    }

    @Test
    public void createRaceHouse_should_return_house() {
        OrcFactory orcFactory = new OrcFactory();
        //Act
        IRaceHouse result = orcFactory.createRaceHouse();
        //Assert
        assertNotNull(result);
    }
}