package com.academiaDigital.softwareArchitecture.practice10.cached;

import com.academiaDigital.softwareArchitecture.practice10.dto.Image;

import java.util.HashMap;

public class ImageProvider implements IImageProvider {
    HashMap<String, Image> listOfImages = new HashMap<>(){{
        put("drink",new Image("1","drink.jpg","ATP"));
        put("food",new Image("2","food.jpg","ATP"));
        put("indoor",new Image("3","indoor.jpg","ATP"));
        put("object",new Image("4","object.jpg","ATP"));
        put("people",new Image("5","people.jpg","ATP"));
        put("plant",new Image("6","plant.jpg","ATP"));
        put("sky",new Image("7","sky.jpg","ATP"));
        put("adult",new Image("8","adult.jpg","+18"));
        put("racy",new Image("9","racy.jpg","+18"));
        put("gory",new Image("10","gory.jpg","+18"));
    }};
    @Override
    public HashMap<String, Image> getPopularImages() {
        return listOfImages;
    }

    @Override
    public Image getImage(String imageId) {
        return listOfImages.get(imageId);
    }

}
