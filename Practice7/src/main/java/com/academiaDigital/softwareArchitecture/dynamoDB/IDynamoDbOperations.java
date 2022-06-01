package com.academiaDigital.softwareArchitecture.dynamoDB;

import com.academiaDigital.softwareArchitecture.Borrowing;

public interface IDynamoDbOperations {
    String create(Borrowing borrowing);
}
