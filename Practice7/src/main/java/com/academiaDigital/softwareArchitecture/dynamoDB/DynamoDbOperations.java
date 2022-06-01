package com.academiaDigital.softwareArchitecture.dynamoDB;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.DynamoDbDto;

public class DynamoDbOperations implements IDynamoDbOperations{
    @Override
    public String create(DynamoDbDto dynamoDbDto) {
        return "created successful on DynamoDB";
    }
}
