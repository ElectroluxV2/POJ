package com.github.electroluxv2.laboratory.l1.Exercise7;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {

            int sum = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum != i) continue;

            System.out.printf("%d,", i);
        }
    }
}
