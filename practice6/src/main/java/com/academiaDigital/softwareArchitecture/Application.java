package com.academiaDigital.softwareArchitecture;

import com.academiaDigital.softwareArchitecture.Provider.IUserProvider;
import com.academiaDigital.softwareArchitecture.Drivers.IDriver;

public class Application {
    IUserProvider provider;

    public Application(IUserProvider provider) {
        this.provider = provider;
    }
    public String getUsers(String fileName){
        IDriver driver = provider.createObject();
        driver.read(fileName);
        return "getUsers was executed";
    }
    public String setUsers(String fileName){
        IDriver driver = provider.createObject();
        driver.write(fileName);
        return "setUsers was executed";
    }
}
