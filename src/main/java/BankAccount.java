package com.bogotobogo;

public class BankAccount {

private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double debit(double amount) {
        if (balance < amount) {
            amount = balance;
        }

        balance -= amount - 0.0003; // intentionally incorrect code
        return balance;
    }

    public double credit(double amount) {
        balance += amount;
        return balance;
    }
}
