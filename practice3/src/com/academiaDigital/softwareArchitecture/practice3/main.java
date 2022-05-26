package com.academiaDigital.softwareArchitecture.practice3;

import com.academiaDigital.softwareArchitecture.practice3.Creator.CSVcreator;
import com.academiaDigital.softwareArchitecture.practice3.Creator.DriveCreator;
import com.academiaDigital.softwareArchitecture.practice3.Creator.XMLcreator;
import com.academiaDigital.softwareArchitecture.practice3.Files.IFIleOperations;

public class main {
    public static void main(String[] args) {
        DriveCreator creatorCSV = new CSVcreator();
        creatorCSV.getUsers("c:\\users\\data.csv");

        IFIleOperations csvObject = creatorCSV.createObject();
        csvObject.read("c:\\users\\data.csv");

        DriveCreator creatorXML = new XMLcreator();
        creatorCSV.getUsers("c:\\users\\data.xml");

        IFIleOperations xmlObject = creatorXML.createObject();
        xmlObject.read("c:\\users\\data.xml");
    }
}
