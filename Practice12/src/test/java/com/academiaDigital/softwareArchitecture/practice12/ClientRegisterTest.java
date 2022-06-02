package com.academiaDigital.softwareArchitecture.practice12;

import static org.junit.Assert.*;

public class ClientRegisterTest {

    @org.junit.Test
    public void testRegisterShouldReturnString() {
        //Arrange
        ClientRegister clientRegister = new ClientRegister(EventName.REGISTER);
        //Act
        String result = clientRegister.register("Alex");
        //Assert
        assertTrue(result.length()>0);
    }
}