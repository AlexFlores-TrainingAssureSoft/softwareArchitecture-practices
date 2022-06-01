package com.academiaDigital.softwareArchitecture.dynamoDB;

import com.academiaDigital.softwareArchitecture.Borrowing;
import com.academiaDigital.softwareArchitecture.DynamoDbDto;

public interface IDynamoDbOperations {
    String create(DynamoDbDto dynamoDbDto);
}
