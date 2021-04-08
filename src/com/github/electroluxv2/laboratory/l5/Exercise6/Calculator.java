package com.github.electroluxv2.laboratory.l5.Exercise6;

final class Calculator {
    public static double calculate(double n1, double n2) {
        return n1 * n2;
    }

    public static double calculate(double n) {
        return Calculator.calculate(n, n);
    }

    public static double calculate(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }
}
