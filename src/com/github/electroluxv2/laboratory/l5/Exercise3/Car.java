package com.github.electroluxv2.laboratory.l5.Exercise3;

abstract class Car {
    private final String color;
    private final String brand;

    protected Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }
}
