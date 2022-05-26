package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Files.IFIleOperations;

public abstract class DriveCreator {

    public void getUsers(String fileName){
        IFIleOperations operations = createObject();
        operations.read(fileName);
    }
    public abstract IFIleOperations createObject();
}
