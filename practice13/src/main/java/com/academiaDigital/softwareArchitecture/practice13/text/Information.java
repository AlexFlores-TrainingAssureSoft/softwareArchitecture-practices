package com.academiaDigital.softwareArchitecture.practice13.text;

public class Information {
    private String text;
    private TypeOfText typeOfText;

    public Information(String text, TypeOfText typeOfText) {
        this.text = text;
        this.typeOfText = typeOfText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TypeOfText getTypeOfText() {
        return typeOfText;
    }

    public void setTypeOfText(TypeOfText typeOfText) {
        this.typeOfText = typeOfText;
    }
}
