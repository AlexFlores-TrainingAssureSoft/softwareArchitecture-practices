package com.academiaDigital.softwareArchitecture.practice12;

public class SmsNotifier implements IListener{
    @Override
    public void notify(String name) {
        System.out.println("Sending SMS to the client name : " + name);
    }
}
