package com.academiaDigital.softwareArchitecture.dynamoDB;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.UserInformation;
import com.academiaDigital.softwareArchitecture.UserProfile;
import com.academiaDigital.softwareArchitecture.mySQL.IMySqlOperations;
import com.academiaDigital.softwareArchitecture.mySQL.MySqlOperations;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamoDbOperationsTest {
    private UserInformation userInformation = new UserInformation("Alex","Flores");
    private Borrowing borrowing = new Borrowing("Credit",1221);
    private UserProfile userProfile = new UserProfile(userInformation,borrowing);

    @Test
    public void create_Expect_String() {
        //Arrange
        IDynamoDbOperations dynamoDbOperations = new DynamoDbOperations();
        //Act
        String result = dynamoDbOperations.create(userProfile.getBorrowing());
        //Assert
        Assert.assertTrue(result.length() >0);
    }
}