package com.github.electroluxv2.homework.h4.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private enum GuessType { LOWER, HIGHER, GUESSED }
    private final int toGuess, maxAttempts;

    public Game(int min, int max, int maxAttempts) {
        this.toGuess = Game.random.nextInt(max - min) + min;
        this.maxAttempts = maxAttempts;
    }

    public void mainLoop() {
        int attempts = 0;
        boolean end = false;
        while (attempts < this.maxAttempts && !end) {
            attempts++;

            switch (this.makeGuess()) {
                case LOWER:
                    System.out.println("Too high.");
                    break;
                case HIGHER:
                    System.out.println("Too low.");
                    break;
                case GUESSED:
                    System.out.println("You won!");
                    end = true;
            }
        }
    }

    private GuessType makeGuess() {
        System.out.print("Enter your guess: ");
        int guessed = Game.scanner.nextInt();

        if (guessed > this.toGuess) return GuessType.LOWER;
        if (guessed < this.toGuess) return GuessType.HIGHER;
        return GuessType.GUESSED;
    }
}
