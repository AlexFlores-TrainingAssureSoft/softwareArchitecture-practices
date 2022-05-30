package com.academiaDigital.softwareArchitecture;

import com.academiaDigital.softwareArchitecture.Provider.CsvUserProvider;
import com.academiaDigital.softwareArchitecture.Provider.IUserProvider;
import com.academiaDigital.softwareArchitecture.Provider.XmlUserProvider;

public class main {
    public static void main(String[] args) {
        IUserProvider csvUserProvider = new CsvUserProvider();
        Application applicationCsv = new Application(csvUserProvider);
        applicationCsv.getUsers("c:\\users\\data.csv");
        System.out.println(applicationCsv.setUsers("c:\\users\\data.csv"));

        IUserProvider xmlUserProvider = new XmlUserProvider();
        Application applicationXml = new Application(xmlUserProvider);
        applicationXml.getUsers("c:\\users\\data.xml");
        applicationXml.setUsers("c:\\users\\data.xml");


    }
}
