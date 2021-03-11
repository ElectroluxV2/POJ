package com.github.electroluxv2.homework.h1.Exercise5;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Random random = new Random();
        short randomChoice = (short) (random.nextDouble() * 3);

        System.out.print("Enter 0, 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        short userChoice = scanner.nextShort();

        boolean win = false, tie = userChoice == randomChoice;

        switch (randomChoice) {
            case 0:
                win = userChoice == 1;
                break;
            case 1:
                win = userChoice == 2;
                break;
            case 2:
                win = userChoice == 0;
                break;
        }

        System.out.printf("You: %d, Computer: %d, Result: %s%n", userChoice, randomChoice, tie ? "Tie" : win ? "Win" : "Defeat");
    }
}
