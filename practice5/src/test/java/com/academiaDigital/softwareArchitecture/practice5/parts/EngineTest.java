package com.academiaDigital.softwareArchitecture.practice5.parts;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    @Test
    public void testVolumeGetter() {
        //Arrange
        Engine engine = new Engine(10,"Hydrogen");
        //Act
        double volume = engine.getVolume();
        //Assert
        assertEquals(10,volume,0.0001);
    }

    @Test
    public void testFuelGetter() {
        //Arrange
        Engine engine = new Engine(10,"Hydrogen");
        //Act
        String fuel = engine.getFuel();
        //Assert
        Assert.assertEquals("Hydrogen",fuel);
    }
}