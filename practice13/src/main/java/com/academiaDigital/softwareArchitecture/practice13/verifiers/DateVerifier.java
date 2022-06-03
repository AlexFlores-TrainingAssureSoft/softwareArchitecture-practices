package com.academiaDigital.softwareArchitecture.practice13.verifiers;

import com.academiaDigital.softwareArchitecture.practice13.text.Information;
import com.academiaDigital.softwareArchitecture.practice13.text.TypeOfText;

import java.util.List;

public class DateVerifier extends EmailVerifier {

    @Override
    public List<Information> validate(List<Information> information) {
        for (Information word:information) {
            if (word.getTypeOfText()== TypeOfText.BIRTHDAY){
                if (!word.getText().matches("\\d{4}-\\d{2}-\\d{2}")){
                    information.set(information.indexOf(word),new Information("0",word.getTypeOfText()));
                }
            }
        }
        return super.validate(information);
    }
}
