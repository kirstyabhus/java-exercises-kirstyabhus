package com.cbfacademy.accounts;

public class test {
    public static void main(String[] args) {
        SavingsAccount2 kirstySavings = new SavingsAccount2(5.2, 10, 564637436);
        CurrentAccount kirstyCurrent = new CurrentAccount(-100, 10, 3239023);

        // kirstySavings.deposit(5);
        // System.out.println("Balance: " + kirstySavings.getBalance());

        // kirstySavings.addInterest();
        // System.out.println("Balance: " + kirstySavings.getBalance());

        // kirstySavings.withdraw(-11);
        // System.out.println("Balance: " + kirstySavings.getBalance());

        kirstyCurrent.withdraw(120);
        System.out.println("Balance: " + kirstyCurrent.getBalance());
    }
}
