package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Files.IFIleOperations;
import com.academiaDigital.softwareArchitecture.practice3.Files.XMLfile;

public class XMLcreator extends DriveCreator {
    @Override
    public IFIleOperations createObject() {
        return new XMLfile();
    }
}
