package com.github.electroluxv2.laboratory.l1.Exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        double celsius = scanner.nextDouble();
        double fahrenheit = (double)9 / 5 * celsius + 32;

        System.out.printf("Celsius: %.2f, Fahrenheit: %.2f%n", celsius, fahrenheit);
    }
}
