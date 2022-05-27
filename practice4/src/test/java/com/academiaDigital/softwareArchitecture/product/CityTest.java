package com.academiaDigital.softwareArchitecture.product;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {

    @Test
    public void getOrcHouses_should_return_array() {
        //Arrange
            IRaceHouse orcHouse = new OrcHouse();
        //Act
            IRace[] result = orcHouse.getAssignedOrcs();
        //Assert
            assertEquals(result.length,0);
    }

    @Test
    public void getElfHouses_should_return_array() {
        //Arrange
        IRaceHouse elfHouse = new ElfHouse();
        //Act
        IRace[] result = elfHouse.getAssignedOrcs();
        //Assert
        assertEquals(result.length,0);
    }
}