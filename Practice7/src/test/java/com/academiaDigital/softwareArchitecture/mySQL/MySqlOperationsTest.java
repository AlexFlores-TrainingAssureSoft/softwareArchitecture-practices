package com.academiaDigital.softwareArchitecture.mySQL;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.UserInformation;
import org.junit.Assert;

public class MySqlOperationsTest {
    private UserInformation userInformation = new UserInformation("Alex","Flores","Credit",1221);

    @org.junit.Test
    public void create_Expect_String() {
        //Arrange
        IMySqlOperations mySqlOperations = new MySqlOperations();
        //Act
        String result = mySqlOperations.create(userInformation.getMysqlDto());
        //Assert
        Assert.assertTrue(result.length() >0);
    }
}