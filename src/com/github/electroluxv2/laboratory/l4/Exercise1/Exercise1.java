package com.github.electroluxv2.laboratory.l4.Exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3,5);
        Fraction fraction2 = new Fraction(1,2);

        System.out.printf("Fraction: %s%n", fraction1);
        System.out.printf("Addiction: %s%n", fraction1.add(fraction2));
        System.out.printf("Subtraction: %s%n", fraction1.subtract(fraction2));
        System.out.printf("Multiplication: %s%n", fraction1.multiply(fraction2));
        System.out.printf("Division: %s%n", fraction1.divide(fraction2));
    }

    private static class Fraction {
        private final int denominator;
        private final int numeral;

        public Fraction(int numeral, int denominator) {
            int gdc = this.gdc(numeral, denominator);

            this.numeral = numeral / gdc;
            this.denominator = denominator / gdc;
        }

        public Fraction add(Fraction other) {
            int numeral = this.numeral * other.denominator + other.numeral * this.denominator;
            int denominator = this.denominator * other.denominator;

            return new Fraction(numeral, denominator);
        }

        public Fraction subtract(Fraction other) {
            return this.add(new Fraction(-other.numeral, other.denominator));
        }

        public Fraction multiply(Fraction other) {
            int numeral = this.numeral * other.numeral;
            int denominator = this.denominator * other.denominator;

            return new Fraction(numeral, denominator);
        }

        public Fraction inverse() {
            return new Fraction(this.denominator, this.numeral);
        }

        public Fraction divide(Fraction other) {
            return this.multiply(other.inverse());
        }

        private int gdc(int n1, int n2) {
            if (n2 == 0) {
                return n1;
            }
            return this.gdc(n2, n1 % n2);
        }

        @Override
        public String toString() {
            return this.numeral + " / " + this.denominator;
        }
    }
}
