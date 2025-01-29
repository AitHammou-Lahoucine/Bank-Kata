package org.bankkata;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        runBankOperations(account);
    }

    public static void runBankOperations(Account account) {
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();
    }
}