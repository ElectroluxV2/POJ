package com.github.electroluxv2.homework.h1.exercise1;

public class Main {
    private static final double CL_TO_KL = 274.15;

    public static void main(String[] args) {
        System.out.printf("%-7s %s%n", "Celsius", "Kelvin");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-7d %06.2f%n", i + 1, i + CL_TO_KL);
        }
    }
}
