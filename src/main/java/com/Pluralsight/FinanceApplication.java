package com.Pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        account1.deposit(100);

        System.out.println("Account 1 Balance: $" + account1.getValue());
        System.out.println("Account 2 Balance: $" + account2.getValue());
    }
}