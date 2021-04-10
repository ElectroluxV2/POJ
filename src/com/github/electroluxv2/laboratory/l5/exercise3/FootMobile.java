package com.github.electroluxv2.laboratory.l5.exercise3;

final class FootMobile extends Car {
    private final boolean airConditioningIncluded;

    public FootMobile(final String color, final String brand, final boolean airConditioningIncluded) {
        super(color, brand);
        this.airConditioningIncluded = airConditioningIncluded;
    }
}
