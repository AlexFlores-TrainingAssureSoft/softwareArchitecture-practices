package com.academiaDigital.softwareArchitecture.Provider;

import com.academiaDigital.softwareArchitecture.Drivers.IDriver;

public interface IUserProvider {

    IDriver createObject();
}
