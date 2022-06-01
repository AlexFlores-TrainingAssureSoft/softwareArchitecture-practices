package com.academiaDigital.softwareArchitecture.mySQL;

import com.academiaDigital.softwareArchitecture.MySqlDto;

public class MySqlOperations implements IMySqlOperations{
    @Override
    public String create(MySqlDto mySqlDto) {
        return "Created successful on mySQL";
    }
}
