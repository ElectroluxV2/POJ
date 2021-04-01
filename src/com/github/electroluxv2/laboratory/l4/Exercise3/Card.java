package com.github.electroluxv2.laboratory.l4.Exercise3;

public class Card {
    private final Colour colour;
    private final Figure figure;

    public Card(Colour colour, Figure figure) {
        this.colour = colour;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return this.figure + " " + this.colour;
    }
}
