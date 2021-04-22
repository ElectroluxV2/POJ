package com.github.electroluxv2.laboratory.l7.exercise7;

public class Main {
    public static void main(String[] args) {
        int sum = sum(new int[][]{{1,2,3}, {10, 2}});
        System.out.printf("Sum: %d%n", sum);
    }

    private static int sum(final int[][] integers) {
        int sum = 0;
        for (final int[] numbers : integers) {
            for (final int number : numbers) {
                sum += number;
            }
        }
        return sum;
    }
}
