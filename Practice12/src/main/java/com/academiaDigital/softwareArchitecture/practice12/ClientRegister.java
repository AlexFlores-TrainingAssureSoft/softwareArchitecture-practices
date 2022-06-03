package com.academiaDigital.softwareArchitecture.practice12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClientRegister implements IProfile{
    private final HashMap<EventName, List<IListener>> subscribers = new HashMap<>();

    public ClientRegister(EventName... operations) {
        for (EventName operation:operations) {
            subscribers.put(operation,new ArrayList<>());
        }
    }

    public void subscriber(IListener listener, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.add(listener);
    }
    public void unsubscribe(IListener listener, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.remove(listener);
    }

    @Override
    public String register(String name) {
        System.out.println("Registering " + name + " client");
        this.trigger(EventName.REGISTER,name);
        return "Client was registered";
    }

    private void trigger(EventName eventName, String event){
        List<IListener> currentList=subscribers.get(eventName);
        for (IListener listener:currentList) {
            listener.notify(event);
        }
    }
}
