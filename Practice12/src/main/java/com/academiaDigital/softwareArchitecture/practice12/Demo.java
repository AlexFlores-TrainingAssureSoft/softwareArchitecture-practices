package com.academiaDigital.softwareArchitecture.practice12;

public class Demo {
    public static void main(String[] args) {
        IListener smsNotifier = new SmsNotifier();
        IListener emailNotifier = new EmailNotifier();
        IListener pinterestNotifier = new PinterestProfile();

        ClientRegister clientRegister = new ClientRegister(EventName.REGISTER);
        clientRegister.subscriber(smsNotifier,EventName.REGISTER);
        clientRegister.subscriber(emailNotifier,EventName.REGISTER);
        clientRegister.subscriber(pinterestNotifier,EventName.REGISTER);
        System.out.println(clientRegister.register("Alex"));

    }
}
