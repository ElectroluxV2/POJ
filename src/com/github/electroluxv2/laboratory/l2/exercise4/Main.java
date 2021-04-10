package com.github.electroluxv2.laboratory.l2.exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter array length and first element: ");
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int first = scanner.nextInt();

        int[] array = new int[length];
        array[0] = first;

        FillArrayBasedOnFirstItem(array);
        int[] copy = array.clone();

        System.out.println("array = " + Arrays.toString(array));
        ValueByFormula(copy);
        System.out.println("array = " + Arrays.toString(copy));
        System.out.println("sum = " + SumArray(array));
        System.out.println("average = " + AverageArray(array));
        System.out.println("another stupid method = " + AnotherStupidMethod(array));
    }

    private static int AnotherStupidMethod(int[] array) {
        int counter = 0;
        boolean odd = array[0] % 2 != 0;

        for (int i : array) {
            if (odd && i % 3 == 0) {
                counter++;
            } else if (!odd && i % 4 == 0) {
                counter++;
            }
        }

        return counter;
    }

    private static float AverageArray(int[] array) {
        int sum = SumArray(array);
        return (float)sum / array.length;
    }

    private static int SumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static void ValueByFormula(int[] array) {
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            array[i] = array[i] - i - 1;
        }
    }

    private static void FillArrayBasedOnFirstItem(int[] array) {
        for (int i = 1; i < array.length; i++) {
           array[i] += array[i - 1] + 2;
        }
    }
}
