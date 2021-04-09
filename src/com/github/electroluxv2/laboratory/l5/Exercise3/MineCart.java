package com.github.electroluxv2.laboratory.l5.Exercise3;

final class MineCart extends Car {
    private final int fuel;

    public MineCart(final String color, final String brand, final int fuel) {
        super(color, brand);
        this.fuel = fuel;
    }
}
