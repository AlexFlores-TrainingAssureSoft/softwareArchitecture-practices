package com.academiaDigital.softwareArchitecture.practice13.verifiers;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;

import java.util.List;

public class NumberVerifier extends EmailVerifier {
    @Override
    public List<Information> validate(List<Information> information) {
        for (Information word:information) {
            if (word.getTypeOfText()== TypeOfText.INTEGER){
               if (!word.getText().matches("[0-9]*")){
                   information.set(information.indexOf(word),new Information("",word.getTypeOfText()));
               }
            }
        }
        return super.validate(information);
    }
}
