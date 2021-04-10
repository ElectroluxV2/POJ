package com.github.electroluxv2.homework.h2.exercise2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[] { 1, 2, 3 };
        int[] array2 = new int[] { 4, 5, 6 };

        System.out.println("array = " + Arrays.toString(SumArrays(array1, array2)));
    }

    private static int[] SumArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) return new int[0];

        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        return result;
    }
}
