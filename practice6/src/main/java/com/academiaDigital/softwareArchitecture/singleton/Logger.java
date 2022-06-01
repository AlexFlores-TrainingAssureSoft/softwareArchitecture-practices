package com.academiaDigital.softwareArchitecture.singleton;

public class Logger {
    private static Logger logger;

    private Logger() {}

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void error(String infoMessage) {
        System.out.println(infoMessage+ "  " + logger.hashCode());
    }

    public void debug() {
        System.out.println("Debugging " + logger.hashCode());
    }

    public void info(String infoMessage) {
        System.out.println(infoMessage + "  " + logger.hashCode());
    }
}
