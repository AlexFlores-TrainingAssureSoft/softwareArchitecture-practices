package com.academiaDigital.softwareArchitecture.practice10;

import com.academiaDigital.softwareArchitecture.practice10.cached.ImageProvider;
import com.academiaDigital.softwareArchitecture.practice10.dto.Image;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ImageProviderTest {

    @Test
    public void testPopularImagesGetter() {
        //Arrange
        ImageProvider imageProvider = new ImageProvider();

        //Act
        HashMap<String, Image> result = imageProvider.getPopularImages();
        //Assert
        assertTrue(result.size()>0);
    }

    @Test
    public void testImageGetter() {
        //Arrange
        ImageProvider imageProvider = new ImageProvider();
        //Act
        Image result = imageProvider.getImage("drink");
        //Assert
        assertNotNull("return image object",result);
    }
}