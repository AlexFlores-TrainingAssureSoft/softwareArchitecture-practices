package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.Name;
import com.academiaDigital.softwareArchitecture.practice9.provider.Preferences;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {
    public Name name = new Name("JOE", Preferences.LIGHT_MODE);
    @Test
    public void getName_should_return_string() {
        //Arrange
        Decorator decorator = new Decorator(name);
        //Act
        String result = decorator.getName();
        //Assert
        assertTrue(result.length()>0);
    }
}