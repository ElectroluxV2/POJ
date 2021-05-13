package com.github.electroluxv2.laboratory.l10.exercise5;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {
    public static int USER_INPUT_SIZE = 6;
    public static int BOUND_INCLUSIVE_MIN = 1;
    public static int BOUND_INCLUSIVE_MAX = 49;

    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);

        final var userGuess = Main.getUnique(Main.BOUND_INCLUSIVE_MIN, Main.BOUND_INCLUSIVE_MAX, Main.USER_INPUT_SIZE, scanner::nextInt, () -> {
            System.out.print("Enter number: ");
            return null;
        });

        final Random random = new Random();

        final var computerGuess = Main.getUnique(Main.BOUND_INCLUSIVE_MIN, Main.BOUND_INCLUSIVE_MAX, Main.USER_INPUT_SIZE, () -> Main.BOUND_INCLUSIVE_MIN + random.nextInt(Main.BOUND_INCLUSIVE_MAX + 1), null);
        // final var computerGuess = Main.getUnique(Main.BOUND_INCLUSIVE_MIN, Main.BOUND_INCLUSIVE_MAX, Main.USER_INPUT_SIZE, () -> ThreadLocalRandom.current().nextInt(Main.BOUND_INCLUSIVE_MIN, Main.BOUND_INCLUSIVE_MAX));

        final long score = computerGuess.stream().filter(userGuess::contains).count();

        System.out.printf("You: %s%nComputer: %s%n", userGuess, computerGuess);
        System.out.printf("%nYour score: %d/%d%n", score, Main.USER_INPUT_SIZE);
    }

    public static Set<Integer> getUnique(final int minValue, final int maxValue, final int size, Callable<Integer> resolver, Callable<Void> prompt) throws Exception {
        Set<Integer> integers = new HashSet<>();
        while (integers.size() < size) {
            if (prompt != null) prompt.call();
            integers.add(resolver.call());
            // Absurdalny poziom skompilowania, Mapa z JS/TS (ES 6+) radzi sobie znacznie lepiej
            integers = integers.stream().mapToInt(Integer::intValue).filter(v -> v >= minValue && v <= maxValue).boxed().collect(Collectors.toSet());
        }
        return integers;
    }

}
