package com.academiaDigital.softwareArchitecture.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void getInstance_should_return_instance_logger() {
        //Arrange
        Logger logger = Logger.getInstance();
        //Act

        //Assert
        assertNotNull(logger);
    }
}