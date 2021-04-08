package com.github.electroluxv2.laboratory.l5.Exercise3;

final class MarioCart extends Car {
    private final boolean rocketLauncherIncluded;

    public MarioCart(String color, String brand, boolean rocketLauncherIncluded) {
        super(color, brand);
        this.rocketLauncherIncluded = rocketLauncherIncluded;
    }
}
