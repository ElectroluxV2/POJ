package com.github.electroluxv2.laboratory.l6.exercise4;

public class Main {
    public static void main(final String[] args) {
        final Time time = new Time(12, 20);
        final Time time2 = new Time(1, 41);
        System.out.printf("Time: %s%n", time);
        System.out.printf("Added: %s%n", time.add(time2));
        System.out.printf("Multiplied: %s%n", time.multiply(20));
    }
}
