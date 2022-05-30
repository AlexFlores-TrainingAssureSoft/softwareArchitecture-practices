package com.academiaDigital.softwareArchitecture;

import com.academiaDigital.softwareArchitecture.Drivers.IDriver;
import com.academiaDigital.softwareArchitecture.Drivers.XmlDriver;
import com.academiaDigital.softwareArchitecture.Provider.CsvUserProvider;
import com.academiaDigital.softwareArchitecture.Provider.IUserProvider;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void getUsers_should_return_an_string() {
        //Arrange
        IUserProvider driver = new CsvUserProvider();
        Application application = new Application(driver);
        //Act
        String result = application.getUsers("file");
        //Assert
        assertEquals("getUsers was executed",result);
    }

    @Test
    public void setUsers_should_return_an_string() {
        //Arrange
        IUserProvider driver = new CsvUserProvider();
        Application application = new Application(driver);
        //Act
        String result = application.setUsers("file");
        //Assert
        assertEquals("setUsers was executed",result);
    }
}