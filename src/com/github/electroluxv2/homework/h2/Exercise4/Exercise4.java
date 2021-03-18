package com.github.electroluxv2.homework.h2.Exercise4;

public class Exercise4 {

    public static void main(String[] args) {
        int[] array = new int[] { -1, 2, -3, 4 };

        System.out.println(Zabawa(array));
    }

    private static int Zabawa(int[] array) {
        int sum = 0;

        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }

        return sum;
    }
}
