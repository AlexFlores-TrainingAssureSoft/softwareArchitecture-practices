package com.academiaDigital.softwareArchitecture.practice3.Drivers;

public class CsvDriver implements IDriver {
    @Override
    public void read(String filename) {
        System.out.println("reading users from csv " + filename);
    }

    @Override
    public void write(String filename, String content) {

    }
}
