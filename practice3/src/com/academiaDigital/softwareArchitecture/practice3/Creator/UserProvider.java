package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Drivers.IDriver;

public abstract class UserProvider {

    public void getUsers(String fileName){
        IDriver operations = createObject();
        System.out.println("\n\n==========================================");
        System.out.println("I'm gonna read the file");
        operations.read(fileName);
        System.out.println("I'm processing the information");
        System.out.println("==========================================\n\n");
    }
    protected abstract IDriver createObject();
}
