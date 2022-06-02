package com.academiaDigital.softwareArchitecture.practice13;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;

import java.util.List;

public class NumberVerifier extends EmailVerifier{
    @Override
    public List<Information> verifier(List<Information> information) {
        for (Information word:information) {
            if (word.getTypeOfText()== TypeOfText.INTEGER){
               if (word.getText().matches("\\d*")){
                   information.set(information.indexOf(information),new Information("",word.getTypeOfText()));
               }
            }
        }
        return super.verifier(information);
    }
}
