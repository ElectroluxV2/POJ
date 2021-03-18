package com.github.electroluxv2.homework.h2.Exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {{ 1, 1 }, { 2, 2 }};
        int[][] matrix2 = new int[][] {{ 2, 2 }, { 3, 3 }};

        System.out.println(SumMatrix(matrix1, matrix2));
    }

    private static int SumMatrix(int[][] matrix1, int[][] matrix2) {
        int sum = 0;

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum += matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }
}
