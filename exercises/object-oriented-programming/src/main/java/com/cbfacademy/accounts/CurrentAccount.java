package com.cbfacademy.accounts;

// INTEREST RATE AS INSTANCE VARIABLE?
// SavingsAccount (a child) inherits from the Account class
public class CurrentAccount extends Account {
    double overdraftLimit;

    // constructor to inherit balance and account number from Account class
    public CurrentAccount(double overdraftLimit, double balance, int accountNumber) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        double newBalance = balance - amount;
        // ensure withraw amount is not negative
        if (amount < 0) {
            System.out.println("ERROR: Can not withdraw a negative amount");
        } else {
            if (newBalance < 0) {
                System.out.println("You are in overdraft.");
            }
            // ensure balance does not pass overdraft limit
            if ((newBalance) < overdraftLimit) {
                System.out.println("ERROR: Can not withdraw amount. Overdraft limit is " + (-overdraftLimit));
            } else {
                balance -= amount;
            }
        }
    }

}
