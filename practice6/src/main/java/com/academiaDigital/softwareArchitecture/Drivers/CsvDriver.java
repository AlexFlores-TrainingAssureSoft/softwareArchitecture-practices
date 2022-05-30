package com.academiaDigital.softwareArchitecture.Drivers;

import com.academiaDigital.softwareArchitecture.singleton.Logger;

public class CsvDriver implements IDriver {
    Logger logger = Logger.getInstance();
    @Override
    public void read(String filename) {
        logger.info();
        System.out.println("reading users from csv " + filename);
    }

    @Override
    public void write(String filename) {
        logger.error();
    }
}
