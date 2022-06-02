package com.academiaDigital.softwareArchitecture.practice13;

import com.academiaDigital.softwareArchitecture.practice13.IVerifier;
import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerifier implements IVerifier {
    private IVerifier next;
    String regx = "^[A-Za-z0-9+_.-]+@(.+)$";
    Pattern pattern=Pattern.compile(regx);
    @Override
    public List<Information> verifier(List<Information> information) {
        if(next == null){
            return verifier(information);
        }
            return this.emailVerifier(information);
    }

    @Override
    public void setNext(IVerifier verifier) {
        next = verifier;
    }

    public List<Information> emailVerifier(List<Information> information){
        for (Information word:information) {
            if (word.getTypeOfText()== TypeOfText.EMAIL){
                Matcher matcher = pattern.matcher(word.getText());
                if (!matcher.matches()){
                    information.set(information.indexOf(word),new Information("null",word.getTypeOfText()));
                }
            }
        }
        return information;
    }
}
