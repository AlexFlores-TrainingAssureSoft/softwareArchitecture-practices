package com.academiaDigital.softwareArchitecture.adapter;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.UserInformation;
import com.academiaDigital.softwareArchitecture.UserProfile;
import com.academiaDigital.softwareArchitecture.dynamoDB.IDynamoDbOperations;
import com.academiaDigital.softwareArchitecture.mySQL.IMySqlOperations;

public class Persistence implements IPersistence{
    private IMySqlOperations mySqlOperations;
    private IDynamoDbOperations dynamoDbOperations;

    public Persistence(IMySqlOperations mySqlOperations, IDynamoDbOperations adaptee) {
        this.mySqlOperations = mySqlOperations;
        this.dynamoDbOperations = adaptee;
    }

    @Override
    public void persistenceInformation(UserProfile userProfile) {
        System.out.println(mySqlOperations.create(userProfile.getUserInformation()));
        System.out.println(dynamoDbOperations.create(userProfile.getBorrowing()));
    }
}
