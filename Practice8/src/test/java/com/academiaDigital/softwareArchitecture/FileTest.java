package com.academiaDigital.softwareArchitecture;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileTest {

    @Test
    public void getPath_should_return_string() {
        //Arrange
        File file = new File("Path");
        //Act
        String result = file.getPath();
        //Assert
        assertTrue(result.length()>0);
    }
}