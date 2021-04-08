package com.github.electroluxv2.laboratory.l5.Exercise3;

class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[] {
            new FootMobile("Orange", "The Flintstones", true),
            new MarioCart("Red", "Nintendo", true),
            new MineCart("Grey", "Micro$oft", -20)
        };

        for (var car : cars) {
            System.out.printf("Color: %s, brand: %s%n", car.getColor(), car.getBrand());
        }
    }
}
