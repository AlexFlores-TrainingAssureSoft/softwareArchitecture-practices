package com.academiaDigital.softwareArchitecture.Provider;

import com.academiaDigital.softwareArchitecture.Drivers.IDriver;
import com.academiaDigital.softwareArchitecture.Drivers.XmlDriver;
import com.academiaDigital.softwareArchitecture.singleton.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class XmlUserProviderTest {

    @Test
    public void createObject_should_return_an_object() {
        //Arrange
        IUserProvider userProvider = new XmlUserProvider();
        //Act
        IDriver result = userProvider.createObject();
        //Assert
        assertNotNull(result);
    }
}