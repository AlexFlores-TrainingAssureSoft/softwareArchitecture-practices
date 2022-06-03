package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.INameProvider;

public class BoldName extends Decorator{
    public BoldName(INameProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName() {
        return  "\033[0;1m" + wrapee.getName();
    }
}
