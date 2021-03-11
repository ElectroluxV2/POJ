package com.github.electroluxv2.laboratory.l1.Exercise6;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.print("Enter 2 cords: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        double x1, y1, x2, y2;

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();


        double d = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) ,0.5);

        System.out.printf("Distance: %.3f", d);
    }
}
