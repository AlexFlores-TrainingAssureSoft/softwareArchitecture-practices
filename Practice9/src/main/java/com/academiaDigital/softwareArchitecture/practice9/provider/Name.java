package com.academiaDigital.softwareArchitecture.practice9.provider;

public class Name implements INameProvider {
    private String name;
    private Preferences preferences;

    public Name(String name, Preferences preferences) {
        this.name = name;
        this.preferences=preferences;
    }
    @Override
    public String getName() {

        return this.name;
    }
}
