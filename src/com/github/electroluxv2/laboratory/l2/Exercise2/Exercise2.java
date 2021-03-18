package com.github.electroluxv2.laboratory.l2.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {

        char[][] matrix = new char[][] {{'x', 'o', 'x'}, {'x', 'x', 'o'}, {'o', 'o', 'o'}};
        PrintMatrix(matrix);
    }

    public static void PrintMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char column : row) {
                System.out.printf("%c ", column);
            }
            System.out.printf("%n");
        }
    }
}
