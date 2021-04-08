package com.github.electroluxv2.laboratory.l5.Exercise3;

final class FootMobile extends Car {
    private final boolean airConditioningIncluded;

    public FootMobile(String color, String brand, boolean airConditioningIncluded) {
        super(color, brand);
        this.airConditioningIncluded = airConditioningIncluded;
    }
}
