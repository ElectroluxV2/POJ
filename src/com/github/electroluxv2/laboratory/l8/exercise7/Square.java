package com.github.electroluxv2.laboratory.l8.exercise7;

public class Square implements Shape {
    private final double a;

    public Square(final double a) {
        this.a = a;
    }

    @Override
    public double calcArea() {
        return this.a * this.a;
    }

    @Override
    public double calcCircumference() {
        return this.a * 4;
    }
}
