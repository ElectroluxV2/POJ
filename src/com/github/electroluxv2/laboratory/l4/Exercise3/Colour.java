package com.github.electroluxv2.laboratory.l4.Exercise3;

public enum Colour {
    CLUBS('\u2663'),
    DIAMONDS('\u2666'),
    HEARTS('\u2764'),
    SPADES('\u2660');

    private final char displayValue;

    Colour(char displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return String.valueOf(this.displayValue);
    }
}
