package com.github.electroluxv2.laboratory.l3.exercise2;

public class Main {
    public static void main(String[] args) {
        Point first = new Point();
        Point second = new Point(4444.32423, 234.1234432445);

        System.out.printf("Distance between points is: %f%n", first.DistanceTo(second));
    }

    private static class Point {
        double x = 0, y = 0;

        public Point() {}

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double DistanceTo(double x, double y) {
            return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        }

        public double DistanceTo(Point other) {
            return this.DistanceTo(other.x, other.y);
        }
    }
}
