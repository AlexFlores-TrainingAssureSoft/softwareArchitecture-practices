package com.academiaDigital.softwareArchitecture.practice9.provider;

public class Name implements INameProvider {
    private String name;
    public Name(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
