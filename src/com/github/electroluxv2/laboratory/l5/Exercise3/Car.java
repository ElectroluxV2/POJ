package com.github.electroluxv2.laboratory.l5.Exercise3;

abstract class Car {
    private final String color;
    private final String brand;

    protected Car(final String color, final String brand) {
        this.color = color;
        this.brand = brand;
    }
    public final String getColor() {
        return this.color;
    }

    public final String getBrand() {
        return this.brand;
    }
}
