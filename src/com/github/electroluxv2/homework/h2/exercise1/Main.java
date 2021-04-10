package com.github.electroluxv2.homework.h2.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of array and its elements: ");
        int length = scanner.nextInt();
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.next().charAt(0);
        }

        System.out.println("array = " + Arrays.toString(array));
    }
}
