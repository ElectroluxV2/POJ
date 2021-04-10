package com.github.electroluxv2.laboratory.l3.exercise1;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.printf("Area: %s, perimeter: %s%n", square.GetArea(), square.GetPerimeter());
    }

    private static class Square {
        private final int width;

        public Square(int width) {
            this.width = width;
        }

        public int GetArea() {
            return this.width * this.width;
        }

        public int GetPerimeter() {
            return 4 * this.width;
        }
    }
}
