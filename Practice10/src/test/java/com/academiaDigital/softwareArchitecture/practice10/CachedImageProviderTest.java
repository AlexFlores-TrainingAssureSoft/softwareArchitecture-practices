package com.academiaDigital.softwareArchitecture.practice10;

import com.academiaDigital.softwareArchitecture.practice10.cached.CachedImageProvider;
import com.academiaDigital.softwareArchitecture.practice10.cached.ImageProvider;
import com.academiaDigital.softwareArchitecture.practice10.dto.Image;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CachedImageProviderTest {
        private ImageProvider imageProvider = new ImageProvider();
    @org.junit.Test
    public void testPopularImagesGetter() {
        //Arrange
        CachedImageProvider cachedImageProvider = new CachedImageProvider(imageProvider);
        //Act
            HashMap<String, Image>  result = cachedImageProvider.getPopularImages();
        //Assert
            assertTrue(result.size()>0);
    }

    @org.junit.Test
    public void testImageGetter() {
        //Arrange
        CachedImageProvider cachedImageProvider = new CachedImageProvider(imageProvider);
        //Act
        Image result = cachedImageProvider.getImage("drink");
        //Assert
        assertNotNull("return image object",result);
    }
}