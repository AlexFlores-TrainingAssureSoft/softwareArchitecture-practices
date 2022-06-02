package com.academiaDigital.softwareArchitecture.practice13.verifiers;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumberVerifierTest {
    List<Information> words = new ArrayList<>(Arrays.asList(
            new Information("alex@gmail.com", TypeOfText.EMAIL),
            new Information("1234s",TypeOfText.INTEGER),
            new Information("1999-05-05",TypeOfText.BIRTHDAY)
    ));
    @Test
    public void validate() {
        //Arrange
        IVerifier numberVerifier = new NumberVerifier();
        //Act
        List<Information> result = numberVerifier.validate(words);
        //Assert
        assertTrue(result.size()>0);
    }
}