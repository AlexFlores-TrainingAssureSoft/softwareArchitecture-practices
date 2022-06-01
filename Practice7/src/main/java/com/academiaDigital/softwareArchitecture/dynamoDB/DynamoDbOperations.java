package com.academiaDigital.softwareArchitecture.dynamoDB;

import com.academiaDigital.softwareArchitecture.Borrowing;

public class DynamoDbOperations implements IDynamoDbOperations{
    @Override
    public String create(Borrowing borrowing) {
        return "created successful on DynamoDB";
    }
}
