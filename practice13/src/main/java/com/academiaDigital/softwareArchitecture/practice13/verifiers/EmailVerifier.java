package com.academiaDigital.softwareArchitecture.practice13.verifiers;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerifier extends Verifier {
    String regx = "^[A-Za-z0-9+_.-]+@(.+)$";
    Pattern pattern=Pattern.compile(regx);
    @Override
    public List<Information> validate(List<Information> information) {
        for (Information word:information) {
            if (word.getTypeOfText()== TypeOfText.EMAIL){
                Matcher matcher = pattern.matcher(word.getText());
                if (!matcher.matches()){
                    information.set(information.indexOf(word),new Information("",word.getTypeOfText()));
                }
            }
        }
        return super.validate(information);
    }
}
