package com.academiaDigital.softwareArchitecture.product;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    @Test
    public void getAssignedOrcs_should_return_Orc_array() {
        //Arrange
        IRaceHouse orcHouse = new OrcHouse();
        //Act
        IRace[] result = orcHouse.getAssignedOrcs();
        //Assert
        assertEquals(result.length,0);
    }

    @Test
    public void getAssigned_should_return_Elf_array() {
        //Arrange
        IRaceHouse elfHouse = new ElfHouse();
        //Act
        IRace[] result = elfHouse.getAssignedOrcs();
        //Assert
        assertEquals(result.length,0);
    }
}