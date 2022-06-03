package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.INameProvider;

public class Decorator implements INameProvider {
    INameProvider wrapee;

    public Decorator(INameProvider wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public String getName() {
        return wrapee.getName();
    }
}
