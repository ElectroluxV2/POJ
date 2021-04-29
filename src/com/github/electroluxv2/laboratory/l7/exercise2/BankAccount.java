package com.github.electroluxv2.laboratory.l7.exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private static final String EMPTY = "";
    private static final String MINUS = "-";
    private double balance;

    public BankAccount(final double initialBalance) {
        balance = BankAccount.round(initialBalance);
    }

    private static double round(final double value) {
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private static double parseMoney(final String stringMoney) throws NumberFormatException {
        return BankAccount.round(Math.abs(Double.parseDouble(stringMoney)));
    }

    private static String stripStringToContainOnlyNumbers(final String string) {
        return string.replaceAll("\\D", BankAccount.EMPTY);
    }

    private static double parseUserInput(final String userInput) throws IllegalArgumentException {
        if (userInput == null) {
            throw new IllegalArgumentException("UserInput must be String, null given.");
        }

        final String onlyDigits = BankAccount.stripStringToContainOnlyNumbers(userInput);
        return BankAccount.parseMoney(onlyDigits);
    }

    public void transaction(final String userInput) {
        try {
            final double operationValue = BankAccount.parseUserInput(userInput);
            if (userInput.contains(BankAccount.MINUS)) { this.withdraw(operationValue); }
            else { this.deposit(operationValue); }

        } catch (InsufficientFundsException e) {
            System.out.printf("Transaction error: %s%n", e.getMessage());

        } catch (NumberFormatException e) {
            System.out.printf("Input error: %s%n", e.getMessage());

        } catch (MoreThanEnoughFundsException | IllegalArgumentException e) {
            System.out.printf("System error: %s%n", e.getMessage());
        }
    }

    private void deposit(final double depositAmount) throws MoreThanEnoughFundsException {
        this.balance = BankAccount.round(this.balance + Math.abs(depositAmount));

        if (Double.isInfinite(this.balance) || Double.isNaN(this.balance)) {
            throw new MoreThanEnoughFundsException("Storing money in double is worse than in BigDecimal IMHO.");
        }
    }

    private void withdraw(final double withdrawAmount) throws InsufficientFundsException {
        if (BankAccount.round(this.balance - Math.abs(withdrawAmount)) < 0.00) {
            throw new InsufficientFundsException("You don't have enough funds to withdraw $%.2f".formatted(withdrawAmount));
        }

        this.balance = BankAccount.round(this.balance - Math.abs(withdrawAmount));
    }

    public void printBalance() {
        System.out.printf("Account has a balance of %.2f%n", balance);
    }
}