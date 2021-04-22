package com.github.electroluxv2.laboratory.l7.exercise2;

import java.util.Scanner;

public class Main {
    private static final String EXIT = "exit";
    private final static BankAccount account = new BankAccount(Math.random() * 10000);
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            final String line = in.nextLine();
            if (EXIT.equals(line)) {
                isExit = true;
            } else {
                try {
                    account.transaction(line);
                } catch (NumberFormatException e) {
                    System.out.printf("Bad input data: %s%n", line);
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
