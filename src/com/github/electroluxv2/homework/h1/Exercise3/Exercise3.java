package com.github.electroluxv2.homework.h1.Exercise3;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthIndex = scanner.nextInt();

        DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
        System.out.printf("Month on position %d is %s.%n", monthIndex, dfs.getMonths()[monthIndex - 1]);
    }
}
