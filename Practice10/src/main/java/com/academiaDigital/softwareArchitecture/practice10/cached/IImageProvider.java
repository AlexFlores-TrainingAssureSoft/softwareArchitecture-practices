package com.academiaDigital.softwareArchitecture.practice10.cached;

import com.academiaDigital.softwareArchitecture.practice10.dto.Image;

import java.util.HashMap;

public interface IImageProvider {
    HashMap<String, Image> getPopularImages();
    Image getImage(String imageId);
}
