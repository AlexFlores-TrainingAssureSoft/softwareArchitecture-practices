package com.academiaDigital.softwareArchitecture;

public class UserInformation {
    private String name;
    private String lastName;
    private String type;
    private double amount;

    private MySqlDto mysqlDto;
    private DynamoDbDto dynamoDbDto;

    public UserInformation(String name, String lastName, String type, double amount) {
        this.name = name;
        this.lastName = lastName;
        this.type = type;
        this.amount = amount;
        mysqlDto = new MySqlDto(name,lastName);
        dynamoDbDto = new DynamoDbDto(type,amount);
    }

    public MySqlDto getMysqlDto() {
        return mysqlDto;
    }

    public void setMysqlDto(MySqlDto mysqlDto) {
        this.mysqlDto = mysqlDto;
    }

    public DynamoDbDto getDynamoDbDto() {
        return dynamoDbDto;
    }

    public void setDynamoDbDto(DynamoDbDto dynamoDbDto) {
        this.dynamoDbDto = dynamoDbDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
