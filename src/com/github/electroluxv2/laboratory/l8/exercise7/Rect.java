package com.github.electroluxv2.laboratory.l8.exercise7;

public class Rect implements Shape {
    private final double a;
    private final double b;

    public Rect(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return this.a * this.b;
    }

    @Override
    public double calcCircumference() {
        return this.a * 2 + this.b * 2;
    }
}
