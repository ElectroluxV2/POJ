package com.github.electroluxv2.laboratory.l6.exercise5;

public class BWM extends Car {

    public BWM(final String color, final int year) {
        super(200, color, "BMW", year);
    }

    @Override
    public void accelerate() {
        int value = 30;

        if (this.speed + value > this.speedLimit) {
            value = this.speedLimit - this.speed;
        }

        this.speed += value;
    }
}
