package com.academiaDigital.softwareArchitecture.practice3.Creator;

import com.academiaDigital.softwareArchitecture.practice3.Files.CSVfile;
import com.academiaDigital.softwareArchitecture.practice3.Files.IFIleOperations;

public class CSVcreator extends DriveCreator {
    @Override
    public IFIleOperations createObject() {
        return new CSVfile();
    }
}
