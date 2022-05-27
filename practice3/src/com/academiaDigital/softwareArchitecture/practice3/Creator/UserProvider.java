package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Files.CSVfile;
import com.academiaDigital.softwareArchitecture.practice3.Files.IFIleOperations;

public abstract class DriveCreator {

    public void getUsers(String fileName){
        IFIleOperations operations = createObject();
        System.out.println("\n\n==========================================");
        System.out.println("I'm gonna read the file");
        operations.read(fileName);
        System.out.println("I'm processing the information");
        System.out.println("==========================================\n\n");
    }
    public abstract IFIleOperations createObject();
}
