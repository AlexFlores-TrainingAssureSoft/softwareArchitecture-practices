package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.INameProvider;

public class UnderlineName extends Decorator {
    public UnderlineName(INameProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName() {
        return  "\033[4;30m" + wrapee.getName() + "\033[0m";
    }
}
