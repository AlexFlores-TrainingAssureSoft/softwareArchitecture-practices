package com.academiaDigital.softwareArchitecture.practice13;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;

import java.util.ArrayList;
import java.util.List;

public class Verifier {
    public static void main(String[] args) {
        List<Information> words = new ArrayList<>();
        Information email = new Information("alex@gmail.com", TypeOfText.EMAIL);
        Information number = new Information("123j",TypeOfText.INTEGER);
        words.add(email);
        words.add(number);

        IVerifier numberVerifier = new NumberVerifier();

        List<Information> result = numberVerifier.verifier(words);
        result.stream().forEach(System.out::println);
    }
}
