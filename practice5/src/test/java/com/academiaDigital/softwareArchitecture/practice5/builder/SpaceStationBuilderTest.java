package com.academiaDigital.softwareArchitecture.practice5.builder;

import com.academiaDigital.softwareArchitecture.practice5.products.SpaceStation;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpaceStationBuilderTest {

    @Test
    public void getSpaceStation() {
        //Arrange
        SpaceStationBuilder spaceStationBuilder = new SpaceStationBuilder();
        //Act
        SpaceStation spaceStationTest = spaceStationBuilder.getSpaceStation();
        //Assert
        assertNotNull(spaceStationTest);
    }
}