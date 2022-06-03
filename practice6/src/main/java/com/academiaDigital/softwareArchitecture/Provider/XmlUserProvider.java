package com.academiaDigital.softwareArchitecture.Provider;

import com.academiaDigital.softwareArchitecture.Drivers.IDriver;
import com.academiaDigital.softwareArchitecture.Drivers.XmlDriver;

public class XmlUserProvider implements IUserProvider {

    @Override
    public IDriver createObject() {
        return new XmlDriver();
    }
}
