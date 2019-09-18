package com.bogotobogo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
    @Test
    public void testDebit() {
       com.bogotobogo.BankAccount account = new com.bogotobogo.BankAccount(10);
       double amount = account.debit(5);
       Assert.assertEquals(5.0, amount, 0.001);
    }

    @Test
    public void testCredit() {
        com.bogotobogo.BankAccount account = new com.bogotobogo.BankAccount(10);
        double amount = account.credit(5);
        Assert.assertEquals(15, amount, 0.001);
    }
}