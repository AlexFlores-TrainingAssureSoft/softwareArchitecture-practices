package com.academiaDigital.softwareArchitecture.practice10;

import com.academiaDigital.softwareArchitecture.practice10.cached.CachedImageProvider;
import com.academiaDigital.softwareArchitecture.practice10.cached.ImageProvider;
import com.academiaDigital.softwareArchitecture.practice10.dto.UserProfile;

public class Demo {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("115asd51",122);
        ImageProvider imageProvider = new ImageProvider();
        CachedImageProvider proxy = new CachedImageProvider(imageProvider);
        ImageDownloader imageDownloader = new ImageDownloader(proxy);
        imageDownloader.returnPopularImageValidated(userProfile);
    }
}
