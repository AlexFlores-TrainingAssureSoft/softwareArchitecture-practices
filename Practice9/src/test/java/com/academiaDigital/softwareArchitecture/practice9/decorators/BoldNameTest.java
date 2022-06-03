package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.Name;

import static org.junit.Assert.*;

public class BoldNameTest {
    public Name name = new Name("JOE");
    @org.junit.Test
    public void getName_should_return_string() {
        //Arrange
        BoldName boldName = new BoldName(name);
        //Act
        String result = boldName.getName();
        //Assert
        assertTrue(result.length()>0);
    }

    @org.junit.Test
    public void darkModeName_should_return_string() {
        //Arrange
        DarkModeName darkModeName = new DarkModeName(name);
        //Act
        String result = darkModeName.getName();
        //Assert
        assertTrue(result.length()>0);
    }

    @org.junit.Test
    public void lightModeName_should_return_string() {
        //Arrange
        LightModeName lightModeName = new LightModeName(name);
        //Act
        String result = lightModeName.getName();
        //Assert
        assertTrue(result.length()>0);
    }

    @org.junit.Test
    public void underlineName_should_return_string() {
        //Arrange
        UnderlineName underlineName = new UnderlineName(name);
        //Act
        String result = underlineName.getName();
        //Assert
        assertTrue(result.length()>0);
    }

    @org.junit.Test
    public void exclamationName_should_return_string() {
        //Arrange
        ExclamationName exclamationName = new ExclamationName(name);
        //Act
        String result = exclamationName.getName();
        //Assert
        assertTrue(result.length()>0);
    }
}