package com.academiaDigital.softwareArchitecture.practice13.verifiers;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DateVerifierTest {
    List<Information> words = new ArrayList<>(Arrays.asList(
            new Information("alex@gmail.com", TypeOfText.EMAIL),
            new Information("1234s",TypeOfText.INTEGER),
            new Information("1999-05-05",TypeOfText.BIRTHDAY)
    ));
    @org.junit.Test
    public void testValidateReturnList() {
        //Arrange
        IVerifier dateVerifier = new DateVerifier();
        //Act
        List<Information> result = dateVerifier.validate(words);
        //Assert
        assertTrue(result.size()>0);
    }
}