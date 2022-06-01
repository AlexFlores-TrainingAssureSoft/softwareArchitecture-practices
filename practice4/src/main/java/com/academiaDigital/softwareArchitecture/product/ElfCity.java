package com.academiaDigital.softwareArchitecture.product;

public class ElfCity implements IRaceCity{
    @Override
    public IRaceHouse getRaceHouses() {
        return new ElfHouse();
    }
}
