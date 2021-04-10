package com.github.electroluxv2.laboratory.l2.exercise3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[] { 1, 2, 3 };
        int[] array2 = new int[] { 4, 5, 2, 1 };

        ArrayDiff(array1, array2);
    }

    public static void ArrayDiff(int[] array1, int[] array2) {
        int max = Math.max(array1.length, array2.length);
        int[] differences = new int[max];

        for (int i = 0; i < max; i++) {
            int item1 = i < array1.length ? array1[i] : 0;
            int item2 = i < array2.length ? array2[i] : 0;

            if (array1.length > array2.length) {
                differences[i] = item1 - item2;
            } else {
                differences[i] = item2 - item1;
            }

        }

        System.out.println("array1 = " + Arrays.toString(array1) + ", array2 = " + Arrays.toString(array2) + ", differences = " + Arrays.toString(differences));
    }
}
