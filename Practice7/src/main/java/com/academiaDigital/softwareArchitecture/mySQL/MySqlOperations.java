package com.academiaDigital.softwareArchitecture.mySQL;

import com.academiaDigital.softwareArchitecture.UserInformation;

public class MySqlOperations implements IMySqlOperations{
    @Override
    public String create(UserInformation userInformation) {
        return "Created successful on mySQL";
    }
}
