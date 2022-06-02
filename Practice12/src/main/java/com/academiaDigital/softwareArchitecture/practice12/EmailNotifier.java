package com.academiaDigital.softwareArchitecture.practice12;

public class EmailNotifier implements IListener{
    @Override
    public void notify(String name) {
        System.out.println("Sending and Email to the client name : "+ name);
    }
}
