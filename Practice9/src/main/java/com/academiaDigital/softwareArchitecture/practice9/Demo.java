package com.academiaDigital.softwareArchitecture.practice9;

import com.academiaDigital.softwareArchitecture.practice9.decorators.BoldName;
import com.academiaDigital.softwareArchitecture.practice9.decorators.DarkModeName;
import com.academiaDigital.softwareArchitecture.practice9.decorators.UnderlineName;
import com.academiaDigital.softwareArchitecture.practice9.provider.Name;

public class Demo {
    public static void main(String[] args) {
        Name name = new Name("JOE");
        BoldName boldName = new BoldName(name);
        UnderlineName underlineName = new UnderlineName(boldName);
        DarkModeName darkMode = new DarkModeName(underlineName);

        System.out.println(darkMode.getName());
    }
}
