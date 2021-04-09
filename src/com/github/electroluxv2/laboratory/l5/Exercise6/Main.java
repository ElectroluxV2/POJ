package com.github.electroluxv2.laboratory.l5.Exercise6;

class Main {

    public static void main(final String[] args) {
        final double n1 = 10, n2 = 20, n3 = 30;

        System.out.printf("calculate(double n1, double n2): %.2f%n", Calculator.calculate(n1, n2));
        System.out.printf("calculate(double n): %.2f%n", Calculator.calculate(n1));
        System.out.printf("calculate(double n1, double n2, double n3): %.2f%n", Calculator.calculate(n1, n2, n3));
    }
}
