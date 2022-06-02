package com.academiaDigital.softwareArchitecture.practice13;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;

import java.util.List;

public interface IVerifier {
    List<Information> verifier(List<Information> information);
    void setNext(IVerifier verifier);
}
