package com.academiaDigital.softwareArchitecture.practice5.builder;

import com.academiaDigital.softwareArchitecture.practice5.products.Rocket;
import org.junit.Test;

import static org.junit.Assert.*;

public class RocketBuilderTest {
    @Test
    public void getRocket() {
        //Arrange
        RocketBuilder rocketBuilder = new RocketBuilder();
        //Act
        Rocket rocketTest = rocketBuilder.getRocket();
        //Assert
        assertNotNull(rocketTest);
    }
}