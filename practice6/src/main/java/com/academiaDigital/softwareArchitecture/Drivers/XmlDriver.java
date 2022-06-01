package com.academiaDigital.softwareArchitecture.Drivers;

import com.academiaDigital.softwareArchitecture.singleton.Logger;

public class XmlDriver implements IDriver {
    Logger logger = Logger.getInstance();
    @Override
    public void read(String filename) {
        logger.error("Error message");
        System.out.println("reading users from xml " + filename);
    }

    @Override
    public void write(String filename) {
        logger.error("Error message");
    }
}
