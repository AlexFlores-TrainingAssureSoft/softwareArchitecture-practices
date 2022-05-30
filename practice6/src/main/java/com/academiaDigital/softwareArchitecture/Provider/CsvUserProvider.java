package com.academiaDigital.softwareArchitecture.Provider;

import com.academiaDigital.softwareArchitecture.Drivers.CsvDriver;
import com.academiaDigital.softwareArchitecture.Drivers.IDriver;

public class CsvUserProvider implements IUserProvider {

    @Override
    public IDriver createObject() {
        return new CsvDriver();
    }
}
