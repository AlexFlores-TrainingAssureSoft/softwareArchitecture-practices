package com.academiaDigital.softwareArchitecture.practice9.decorators;

import com.academiaDigital.softwareArchitecture.practice9.provider.INameProvider;

public class DarkModeName extends Decorator {

    public DarkModeName(INameProvider wrapee) {
        super(wrapee);
    }
    @Override
    public String getName(){
        return "!!! " +  wrapee.getName()+ " !!!" + "(╯°□°)╯︵ ┻━┻";
    }


}
