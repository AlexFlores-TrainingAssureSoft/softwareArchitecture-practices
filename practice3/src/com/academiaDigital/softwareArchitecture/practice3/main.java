package com.academiaDigital.softwareArchitecture.practice3;

import com.academiaDigital.softwareArchitecture.practice3.Creator.CsvUserProvider;
import com.academiaDigital.softwareArchitecture.practice3.Creator.UserProvider;
import com.academiaDigital.softwareArchitecture.practice3.Creator.XmlUserProvider;
import com.academiaDigital.softwareArchitecture.practice3.Drivers.IDriver;

public class main {
    public static void main(String[] args) {
        UserProvider creatorCSV = new CsvUserProvider();
        creatorCSV.getUsers("c:\\users\\data.csv");



        UserProvider creatorXML = new XmlUserProvider();
        creatorXML.getUsers("c:\\users\\data.xml");


    }
}
