package com.academiaDigital.softwareArchitecture.product;

public class OrcCity implements IRaceCity{
    @Override
    public IRaceHouse getRaceHouses() {
        return new OrcHouse();
    }
}
