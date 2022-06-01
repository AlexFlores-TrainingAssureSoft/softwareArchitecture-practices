package com.academiaDigital.softwareArchitecture.practice9.provider;

import com.academiaDigital.softwareArchitecture.practice9.decorators.Decorator;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    @Test
    public void getName_should_return_string() {
        //Arrange
        Name name = new Name("JOE", Preferences.LIGHT_MODE);
        //Act
        String result = name.getName();
        //Assert
        assertTrue(result.length()>0);
    }
}