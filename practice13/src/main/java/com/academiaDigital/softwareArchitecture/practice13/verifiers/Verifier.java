package com.academiaDigital.softwareArchitecture.practice13.verifiers;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;

import java.util.List;

public class Verifier implements IVerifier {
    private IVerifier next;
    @Override
    public List<Information> validate(List<Information> information) {
        if(next != null){
            return next.validate(information);
        }
        return information;
    }

    @Override
    public void setNext(IVerifier verifier) {
        next = verifier;
    }
}
