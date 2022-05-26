package com.academiaDigital.softwareArchitecture.practice3.Files;

public class CSVfile implements IFIleOperations{
    @Override
    public void read(String filename) {
        System.out.println("reading users from -> " + filename);
    }

    @Override
    public void write(String filename, String content) {

    }
}
