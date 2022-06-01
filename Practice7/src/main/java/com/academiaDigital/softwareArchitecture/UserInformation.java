package com.academiaDigital.softwareArchitecture;

public class UserInformation2 {
    private String name;
    private String lastName;
    private String type;
    private double amount;

    private MysqlDto mysqlDto;
    private DynamoDbDto dynamoDbDto;

    public UserInformation2(String name, String lastName, String type, double amount) {
        this.name = name;
        this.lastName = lastName;
        this.type = type;
        this.amount = amount;
        mysqlDto = new MysqlDto(name,lastName);
        dynamoDbDto = new DynamoDbDto(type,amount);
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
