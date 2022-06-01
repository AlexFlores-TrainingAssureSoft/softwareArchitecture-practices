package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.INameProvider;

public class ExclamationName extends Decorator{
    public ExclamationName(INameProvider wrapee) {
        super(wrapee);
    }
    public String getName() {
        return wrapee.getName();
    }
}
