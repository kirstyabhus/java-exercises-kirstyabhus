package com.cbfacademy.accounts;

/**
 * Account
 */
public class Account {
    double balance;
    int accountNumber;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    // return the balance
    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;

    }

    void withdraw(double amount) {
        // ensure withraw amount is not negative
        if (amount < 0) {
            System.out.println("ERROR: Can not withdraw a negative amount");
        } else {
            // ensure balance does not go into negative
            if ((balance - amount) < 0) {
                System.out.println("ERROR: Can not withdraw amount. Balance is insufficient.");
                // only decrease balance in amount that is not negative & does not take balance
                // into
                // negative
            } else {
                balance -= amount;
            }
        }

    }

}