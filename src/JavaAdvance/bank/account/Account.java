package JavaAdvance.bank.account;

import java.util.Scanner;

public class Account {


    private String number;
    protected int balance;
    private Client client;

    public Account(String number, int balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public void deposit(int cash) {
        balance += cash;
    }

    public int withdraw(int cash) {
        if (cash < 0) {
            System.out.println("Nie można");
            return 0;
        }
        if (canWithdraw(cash)) {
            balance -= cash;
            return cash;
        } else {
            return 0;
        }
    }

    public int getBalance() {
        return balance;
    }

    public boolean transfer(Account target, int amount) {
        balance -= amount;
        target.balance += amount;
        return true;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Stan konta " + number + " to: " + balance ;
    }

    private boolean checkNoMinusBalanse(int cash) {
        return balance >= cash;
    }

    private boolean canWithdraw(int cash) {
        return balance >= cash;
    }


}
