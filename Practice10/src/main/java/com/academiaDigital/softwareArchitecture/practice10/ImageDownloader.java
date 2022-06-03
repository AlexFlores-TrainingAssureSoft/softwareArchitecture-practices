package com.academiaDigital.softwareArchitecture.practice10;

import com.academiaDigital.softwareArchitecture.practice10.cached.IImageProvider;
import com.academiaDigital.softwareArchitecture.practice10.dto.Image;
import com.academiaDigital.softwareArchitecture.practice10.dto.UserProfile;

import java.util.HashMap;

public class ImageDownloader {
    private IImageProvider api;
    HashMap<String, Image> list;
    public ImageDownloader(IImageProvider imageProvider) {
        this.api = imageProvider;
    }


    public void returnPopularImageValidated(UserProfile userProfile){
            list=api.getPopularImages();
        for (Image image:list.values()) {
            if (userProfile.getAge()<=18){
                if (image.classification=="ATP"){
                    System.out.println("Rendering : "+image.id + " Title : "+ image.title);
                }
            }else{
                System.out.println("Rendering : "+image.id + " Title : "+ image.title);
            }
        }
    }
}
