package com.github.electroluxv2.laboratory.l7.exercise2;

import java.util.Scanner;

public class Main {
    private static final String EXIT = "q";
    private final static BankAccount account = new BankAccount(Math.random() * 10000);

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true /* Dlaczego nie mogę tu zrobić: (final String userInput = scanner.nextLine() && !userInput.equals(Main.EXIT)) ??? */ ) {
            Main.account.printBalance();

            final String userInput = scanner.nextLine();

            if (userInput.equals(Main.EXIT)) { break; }

            Main.account.transaction(userInput);
        }
    }
}
