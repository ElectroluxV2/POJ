package com.github.electroluxv2.laboratory.l1.Exercise3;

public class Exercise3 {
    private static final double MI_TO_KM = 1.609;

    public static void main(String[] args) {
        System.out.printf("%-6s %s%n", "Miles", "Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-6d %06.3f%n", i, i * MI_TO_KM);
        }
    }
}
