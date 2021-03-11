package com.github.electroluxv2.homework.h1.Exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.print("Enter amount of students: ");
        int studentsCount;
        Scanner scanner = new Scanner(System.in);
        studentsCount = scanner.nextInt();

        String bestName = null;
        int bestPoints = Integer.MIN_VALUE;

        for (int i = 0; i < studentsCount; i++) {
            System.out.printf("Enter name and points for student #%d: ", i + 1);
            String name;
            int points;

            name = scanner.next();
            points = scanner.nextInt();

            if (points > bestPoints) {
                bestPoints = points;
                bestName = name;
            }
        }

        System.out.printf("Best student is %s with %d points total.%n", bestName, bestPoints);
    }
}
