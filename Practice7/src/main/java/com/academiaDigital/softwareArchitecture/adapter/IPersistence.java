package com.academiaDigital.softwareArchitecture.adapter;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.UserInformation;
import com.academiaDigital.softwareArchitecture.UserProfile;

public interface IPersistence {
    void persistenceInformation(UserProfile userProfile);
}
