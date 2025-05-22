package com.Pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        account1.deposit(100);

        System.out.println("Account 1 Balance: $" + account1.getValue());
        System.out.println("Account 2 Balance: $" + account2.getValue());

        Portfolio portfolio = new Portfolio("My Assets", "Mahmoud");

        portfolio.add(new House("Family Home", 250000, 2010, 2200, 4));
        portfolio.add(new BankAccount("Savings Account", "001122", 8000));
        portfolio.add(new CreditCard("Visa", "334455", 3000));
        System.out.println("Portfolio Owner: Mahmoud");
        System.out.println("Portfolio Name: My Assets");
        System.out.println("Total Portfolio Value: $" + portfolio.getValue());

        Valuable most = portfolio.getMostValuable();
        Valuable least = portfolio.getLeastValuable();

        System.out.println("Most Valuable Asset: $" + (most != null ? most.getValue() : "None"));
        System.out.println("Least Valuable Asset: $" + (least != null ? least.getValue() : "None"));
    }
}