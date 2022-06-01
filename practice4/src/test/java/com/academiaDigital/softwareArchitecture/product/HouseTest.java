package com.academiaDigital.softwareArchitecture.product;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    @Test
    public void getAssignedOrcs_should_return_Orc() {
        //Arrange
        IRaceHouse orcHouse = new OrcHouse();
        //Act
        IRace result = orcHouse.getAssignedOrcs();
        //Assert
        assertNotNull(result);
    }

    @Test
    public void getAssigned_should_return_Elf() {
        //Arrange
        IRaceHouse elfHouse = new ElfHouse();
        //Act
        IRace result = elfHouse.getAssignedOrcs();
        //Assert
        assertNotNull(result);
    }
}