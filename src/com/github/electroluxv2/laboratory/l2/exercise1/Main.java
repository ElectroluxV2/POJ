package com.github.electroluxv2.laboratory.l2.exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] numbers = new int[3];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
