package com.academiaDigital.softwareArchitecture.practice12;

public class PinterestProfile implements IListener{
    @Override
    public void notify(String name) {
        System.out.println("Getting image from : "+ name + " profile on pinterest");
    }
}
