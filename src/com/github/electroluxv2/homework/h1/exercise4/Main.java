package com.github.electroluxv2.homework.h1.exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        ArrayList<Integer> toSort = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            toSort.add(scanner.nextInt());

        toSort.sort(Comparator.reverseOrder());

        System.out.printf("Sorted: %d %d %d%n", toSort.toArray());
    }
}
