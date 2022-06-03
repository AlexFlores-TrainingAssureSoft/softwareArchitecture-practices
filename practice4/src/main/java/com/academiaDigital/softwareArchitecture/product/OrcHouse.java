package com.academiaDigital.softwareArchitecture.product;

public class OrcHouse implements IRaceHouse{
    @Override
    public IRace getAssignedOrcs() {
        return new Orc();
    }
}
