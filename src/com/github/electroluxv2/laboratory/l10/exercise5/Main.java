package com.github.electroluxv2.laboratory.l10.exercise5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {
    /** USER_INPUT_SIZE **/
    public static int UIS = 6;
    /** BOUND_INCLUSIVE_MIN **/
    public static int BMIN = 1;
    /** BOUND_INCLUSIVE_MAX **/
    public static int BMAX = 49;

    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);

        final var userGuess = getUnique(BMIN, BMAX, UIS, scanner::nextInt, () -> {
            System.out.print("Enter number: ");
            return null;
        });

        final var computerGuess = getUnique(BMIN, BMAX, UIS, () -> ThreadLocalRandom.current().nextInt(BMIN, BMAX), null);

        final long score = computerGuess.stream().filter(userGuess::contains).count();

        System.out.printf("You: %s%nComputer: %s%n", userGuess, computerGuess);
        System.out.printf("%nYour score: %d/%d%n", score, UIS);
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
