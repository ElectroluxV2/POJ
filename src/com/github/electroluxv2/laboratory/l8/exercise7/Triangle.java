package com.github.electroluxv2.laboratory.l8.exercise7;

public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        final double p = this.calcCircumference() / 2;
        return  Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    @Override
    public double calcCircumference() {
        return this.a + this.b + this.c;
    }
}
