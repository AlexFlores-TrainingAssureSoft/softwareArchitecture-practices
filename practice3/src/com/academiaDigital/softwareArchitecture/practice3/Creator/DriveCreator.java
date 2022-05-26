package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Files.IFIleOperations;

public abstract class DriveCreator {

    public void getUsers(String fileName){
        System.out.println("Print all users");
    }
    public abstract IFIleOperations createObject();
}
