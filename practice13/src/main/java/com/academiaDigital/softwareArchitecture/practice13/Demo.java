package com.academiaDigital.softwareArchitecture.practice13;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;
import com.academiaDigital.softwareArchitecture.practice13.verifiers.DateVerifier;
import com.academiaDigital.softwareArchitecture.practice13.verifiers.EmailVerifier;
import com.academiaDigital.softwareArchitecture.practice13.verifiers.IVerifier;
import com.academiaDigital.softwareArchitecture.practice13.verifiers.NumberVerifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Information> words = new ArrayList<>(Arrays.asList(
                new Information("alex@gmail.com", TypeOfText.EMAIL),
                new Information("1234s",TypeOfText.INTEGER),
                new Information("1999-05-05",TypeOfText.BIRTHDAY)
        ));

        IVerifier numberVerifier = new NumberVerifier();
        IVerifier emailVerifier = new EmailVerifier();
        IVerifier dateVerifier = new DateVerifier();

        numberVerifier.setNext(emailVerifier);
        emailVerifier.setNext(dateVerifier);

        List<Information> result = numberVerifier.validate(words);
        result.stream().forEach(a -> System.out.println(a.getText()));
    }
}
