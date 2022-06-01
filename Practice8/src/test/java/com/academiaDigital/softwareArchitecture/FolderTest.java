package com.academiaDigital.softwareArchitecture;

import org.junit.Test;

import static org.junit.Assert.*;

public class FolderTest {

    @Test
    public void getPath_should_return_string() {
        //Arrange
        Folder folder = new Folder("Home");
        //Act
        String result = folder.getPath();
        //Assert
        assertTrue(result.length()>0);

    }
}