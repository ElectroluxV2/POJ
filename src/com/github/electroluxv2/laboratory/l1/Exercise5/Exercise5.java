package com.github.electroluxv2.laboratory.l1.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.print("Enter 2 letters: ");
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);

        System.out.println(first >= second ? first : second);
    }
}
