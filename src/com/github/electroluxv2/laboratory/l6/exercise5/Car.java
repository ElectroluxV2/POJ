package com.github.electroluxv2.laboratory.l6.exercise5;

import java.util.Objects;

public abstract class Car {
    protected final int speedLimit;
    protected int speed;
    private final String color;
    private final String brand;
    private final int year;

    public Car(final int speedLimit, final String color, final String brand, final int year) {
        this.speedLimit = speedLimit;
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "%s %s year %04d, current speed: %d".formatted(this.color, this.brand, this.year, this.speed);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speedLimit == car.speedLimit && year == car.year && color.equals(car.color) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedLimit, color, brand, year);
    }

    public abstract void accelerate();
}
