package com.github.electroluxv2.laboratory.l2.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter dimension x y: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] matrix1 = new int[x][y];
        int[][] matrix2 = new int[x][y];

        ReadMatrixFromUser(matrix1);
        ReadMatrixFromUser(matrix2);
        ShowResultOfSubtraction(matrix1, matrix2);
    }

    private static void ReadMatrixFromUser(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = scanner.nextInt();
            }
        }
    }

    private static void ShowResultOfSubtraction(int[][] matrix1, int[][] matrix2) {
        for (int x = 0; x < matrix1.length; x++) {
            for (int y = 0; y < matrix1[x].length; y++) {
                int i1 = matrix1[x][y];
                int i2 = matrix2[x][y];

                System.out.printf("%d ", i1 - i2);
            }
            System.out.printf("%n");
        }
    }


}
