package com.academiaDigital.softwareArchitecture.practice13.verifiers;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;

import java.util.List;

public interface IVerifier {
    List<Information> validate(List<Information> information);
    void setNext(IVerifier verifier);
}
