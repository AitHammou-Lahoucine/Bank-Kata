package org.bankkata;

import java.util.LinkedList;

public class Account implements AccountService {
    private int balance;
    private LinkedList<Transaction> transactions;

    public Account() {
        this.balance = 0;
        this.transactions = new LinkedList<>();
    }

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        transactions.addFirst(new Transaction("deposit", amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        transactions.addFirst(new Transaction("withdrawal", -amount, balance));
    }

    @Override
    public void printStatement() {
        System.out.println("Date\t\t||\tAmount\t||\tBalance");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}