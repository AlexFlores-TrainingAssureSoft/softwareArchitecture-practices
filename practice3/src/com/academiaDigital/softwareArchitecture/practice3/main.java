package com.academiaDigital.softwareArchitecture.practice3;

import com.academiaDigital.softwareArchitecture.practice3.Creator.CSVcreator;
import com.academiaDigital.softwareArchitecture.practice3.Creator.DriveCreator;
import com.academiaDigital.softwareArchitecture.practice3.Creator.XMLcreator;
import com.academiaDigital.softwareArchitecture.practice3.Files.IFIleOperations;

public class main {
    public static void main(String[] args) {
        DriveCreator creatorCSV = new CSVcreator();
        IFIleOperations csvObject = creatorCSV.createObject();

        creatorCSV.getUsers("c:\\users\\data.csv");

        DriveCreator creatorXML = new XMLcreator();
        IFIleOperations xmlObject = creatorXML.createObject();

        creatorXML.getUsers("c:\\users\\data.xml");
    }
}
