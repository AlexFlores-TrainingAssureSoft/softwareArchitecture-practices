package com.academiaDigital.softwareArchitecture.practice10.dto;

public class Image {
    public String id;
    public String title;
    public String classification;

    public Image(String id, String title,String classification) {
        this.id = id;
        this.title = title;
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }
}
