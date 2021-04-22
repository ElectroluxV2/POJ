package com.github.electroluxv2.laboratory.l7.exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private static final String EMPTY = "";
    private static final String MINUS = "-";
    private double balance;
    public BankAccount(final double initialBalance) {
        balance = BigDecimal.valueOf(initialBalance).setScale(2, RoundingMode.HALF_UP).doubleValue();
        printBalance();
    }
    public void transaction(final String value) throws NumberFormatException, InsufficientFundsException {
        if (value.startsWith(MINUS)) {
            withdraw(value.replaceFirst(MINUS, EMPTY));
        } else {
            deposit(value);
        }
    }
    private void deposit(final String depositAmount) throws NumberFormatException {
        balance += Double.parseDouble(depositAmount);
        printBalance();
    }
    private void withdraw(final String withdrawAmount) throws NumberFormatException, InsufficientFundsException {
        final Double parsed = Double.parseDouble(withdrawAmount);
        // https://stackoverflow.com/a/356865/7132461
        //if (balance - parsed < 0.00) {
        final Double afterWithdraw = balance - parsed;
        if ("%.2f".formatted(afterWithdraw) != "0.00" && afterWithdraw < 0) {
            throw new InsufficientFundsException("You need more money: %.2f".formatted(-(afterWithdraw)));
        }
        balance -= parsed;
        printBalance();
    }
    private void printBalance() {
        System.out.printf("Account has a balance of %.2f%n", balance);
    }
}