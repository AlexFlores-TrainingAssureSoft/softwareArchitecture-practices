package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Drivers.CsvDriver;
import com.academiaDigital.softwareArchitecture.practice3.Drivers.IDriver;

public class CsvUserProvider extends UserProvider {
    @Override
    protected IDriver createObject() {
        return new CsvDriver();
    }
}
