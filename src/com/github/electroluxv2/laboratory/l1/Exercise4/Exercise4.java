package com.github.electroluxv2.laboratory.l1.Exercise4;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Enter 3 numbers: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        boolean error = false;
        if (a + b > c) error = true;
        else if (a + c > b) error = true;
        else if (b + c > a) error = true;

        System.out.println(error ? "Yes" : "No");
    }
}
