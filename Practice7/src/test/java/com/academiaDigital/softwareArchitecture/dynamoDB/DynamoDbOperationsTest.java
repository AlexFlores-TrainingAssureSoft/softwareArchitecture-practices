package com.academiaDigital.softwareArchitecture.dynamoDB;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.UserInformation;
import org.junit.Assert;
import org.junit.Test;

public class DynamoDbOperationsTest {
    private UserInformation userInformation = new UserInformation("Alex","Flores","Credit",1221);

    @Test
    public void create_Expect_String() {
        //Arrange
        IDynamoDbOperations dynamoDbOperations = new DynamoDbOperations();
        //Act
        String result = dynamoDbOperations.create(userInformation.getDynamoDbDto());
        //Assert
        Assert.assertTrue(result.length() >0);
    }
}