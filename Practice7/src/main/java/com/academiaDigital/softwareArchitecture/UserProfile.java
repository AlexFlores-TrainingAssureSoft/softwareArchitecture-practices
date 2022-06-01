package com.academiaDigital.softwareArchitecture;

public class UserProfile {
    private UserInformation userInformation;
    private Borrowing borrowing;
    public UserProfile(UserInformation userInformation,Borrowing borrowing) {
        this.borrowing = borrowing;
        this.userInformation = userInformation;
    }

    public Borrowing getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(Borrowing borrowing) {
        this.borrowing = borrowing;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }
}
