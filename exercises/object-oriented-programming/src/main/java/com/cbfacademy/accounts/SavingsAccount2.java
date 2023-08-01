package com.cbfacademy.accounts;

// INTEREST RATE AS INSTANCE VARIABLE?
// SavingsAccount (a child) inherits from the Account class
public class SavingsAccount2 extends Account {
    double interestRate;

    // constructor to inherit balance and account number from Account class
    public SavingsAccount2(double interestRate, double balance, int accountNumber) {
        super(balance, accountNumber);
        this.interestRate = interestRate;

    }

    void addInterest() {
        // calculate interest
        double interest = (interestRate / 100) * balance;

        deposit(interest);
    }

}
