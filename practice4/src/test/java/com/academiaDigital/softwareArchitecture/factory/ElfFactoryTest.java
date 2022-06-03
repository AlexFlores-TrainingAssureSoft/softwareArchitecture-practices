package com.academiaDigital.softwareArchitecture.factory;

import com.academiaDigital.softwareArchitecture.product.IRace;
import com.academiaDigital.softwareArchitecture.product.IRaceCity;
import com.academiaDigital.softwareArchitecture.product.IRaceHouse;
import com.academiaDigital.softwareArchitecture.product.OrcHouse;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElfFactoryTest {

    @Test
    public void createRace_should_return_elf() {
        //Arrange
        ElfFactory elfFactory = new ElfFactory();
        //Act
        IRace result = elfFactory.createRace();
        //Assert
        assertNotNull(result);
    }

    @Test
    public void createRaceCity_should_return_city() {
        ElfFactory elfFactory = new ElfFactory();
        //Act
        IRaceCity result = elfFactory.createRaceCity();
        //Assert
        assertNotNull(result);
    }

    @Test
    public void createRaceHouse_should_return_house() {
        ElfFactory elfFactory = new ElfFactory();
        //Act
        IRaceHouse result = elfFactory.createRaceHouse();
        //Assert
        assertNotNull(result);
    }
}