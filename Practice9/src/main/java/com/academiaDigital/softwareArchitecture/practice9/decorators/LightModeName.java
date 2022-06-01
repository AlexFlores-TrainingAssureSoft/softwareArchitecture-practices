package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.INameProvider;

public class LightModeName extends Decorator {
    public LightModeName(INameProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName() {
        return "*** " +  wrapee.getName()+ " ***" + "┬─┬ノ( º _ ºノ)";
    }
}
