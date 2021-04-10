package com.github.electroluxv2.laboratory.l3.exercise5;

import java.util.Scanner;
import java.util.StringJoiner;

public class Exercise5 {

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i);
        }

        ATM atm = new ATM(accounts);
        atm.MainLoop();
    }
}


class Account {
    private final int id;
    private float money = 100;

    public Account(int id) {
        this.id = id;
    }

    public float GetMoney() {
        return this.money;
    }

    public int GetId() {
        return this.id;
    }

    public boolean Withdraw(float amount) {
        if (this.money - amount < 0) return false;
        money -= amount;
        return true;
    }

    public void Deposit(float amount) {
        this.money += amount;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.money;
    }
}

class ATM {
    private final Scanner scanner = new Scanner(System.in);
    private final Account[] accounts;

    public ATM(Account[] accounts) {
        this.accounts = accounts;
    }

    public int HandleMenu() {
        StringJoiner menu = new StringJoiner("\n");
        menu.add("Main menu");
        menu.add("1: check balance");
        menu.add("2: withdraw");
        menu.add("3: deposit");
        menu.add("4: exit");
        menu.add("Enter a choice: ");
        System.out.println(menu.toString());

        return this.scanner.nextInt();
    }

    public void MainLoop() {
        while (true) {

            System.out.println("Enter an id: ");
            int id = this.scanner.nextInt();
            Account account = this.GetAccount(id);
            if (account == null) continue;

            boolean readNextId = false;
            while (!readNextId) {
                switch(this.HandleMenu()) {
                    case 1:
                        this.CheckBalance(account);
                        break;
                    case 2:
                        this.Withdraw(account);
                        break;
                    case 3:
                        this.Deposit(account);
                        break;
                    case 4:
                        readNextId = true;
                        break;
                }
            }
        }
    }

    private Account GetAccount(int id) {
        for (Account account : this.accounts) {
            if (account.GetId() == id) return account;
        }

        System.out.printf("Account with id %d does not exists!%n", id);
        return null;
    }

    private void Deposit(Account account) {
        System.out.println("Enter amount: ");
        float amount = this.scanner.nextFloat();
        account.Deposit(amount);
    }

    private void Withdraw(Account account) {
        System.out.println("Enter amount: ");
        float amount = this.scanner.nextFloat();
        if (account.Withdraw(amount)) {
            System.out.println("Successfully withdrawn money");
        } else {
            System.out.println("Not enough money!");
        }
    }

    private void CheckBalance(Account account) {
        System.out.printf("Your current balance is: %.2f%n", account.GetMoney());
    }
}
