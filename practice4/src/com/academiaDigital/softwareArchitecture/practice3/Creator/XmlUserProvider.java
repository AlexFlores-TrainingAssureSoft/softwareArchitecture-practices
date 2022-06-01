package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Drivers.IDriver;
import com.academiaDigital.softwareArchitecture.practice3.Drivers.XmlDriver;

public class XmlUserProvider extends UserProvider {
    @Override
    protected IDriver createObject() {
        return new XmlDriver();
    }
}
