package com.cbfacademy.accounts;

// SavingsAccount (a child) inherits from the Account class
public class SavingsAccount extends Account {
    double interestRate;

    // constructor to inherit balance and account number from Account class
    public SavingsAccount(float balance, int accountNumber) {
        super(balance, accountNumber);
    }

    void addInterest() {

    }

}
