package com.academiaDigital.softwareArchitecture.mySQL;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.UserInformation;
import com.academiaDigital.softwareArchitecture.UserProfile;
import org.junit.Assert;

public class MySqlOperationsTest {
    private UserInformation userInformation = new UserInformation("Alex","Flores");
    private Borrowing borrowing = new Borrowing("Credit",1221);
    private UserProfile userProfile = new UserProfile(userInformation,borrowing);

    @org.junit.Test
    public void create_Expect_String() {
        //Arrange
        IMySqlOperations mySqlOperations = new MySqlOperations();
        //Act
        String result = mySqlOperations.create(userProfile.getUserInformation());
        //Assert
        Assert.assertTrue(result.length() >0);
    }
}