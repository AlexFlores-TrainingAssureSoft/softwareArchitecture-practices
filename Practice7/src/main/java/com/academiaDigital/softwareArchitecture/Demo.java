package com.academiaDigital.softwareArchitecture;

import com.academiaDigital.softwareArchitecture.adapter.IPersistence;
import com.academiaDigital.softwareArchitecture.adapter.Persistence;
import com.academiaDigital.softwareArchitecture.dynamoDB.DynamoDbOperations;
import com.academiaDigital.softwareArchitecture.dynamoDB.IDynamoDbOperations;
import com.academiaDigital.softwareArchitecture.mySQL.IMySqlOperations;
import com.academiaDigital.softwareArchitecture.mySQL.MySqlOperations;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Starting of adapter example");
        UserInformation userInformation = new UserInformation("Alex","Flores","Credit",1221);


        IMySqlOperations mySqlOperations = new MySqlOperations();
        IDynamoDbOperations dynamoDbOperations = new DynamoDbOperations();
        IPersistence persistence = new Persistence(mySqlOperations,dynamoDbOperations);
        persistence.persistenceInformation(userInformation);

    }
}
