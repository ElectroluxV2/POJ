package com.github.electroluxv2.laboratory.l6.exercise2;

public class Position {
    private final String goodName;
    private final int count;
    private final double price;

    public Position(final String goodName, final int count, final double price) {
        this.goodName = goodName;
        this.count = count;
        this.price = price;
    }

    public double countWorth() {
        return this.count * this.price;
    }

    @Override
    public String toString() {
        return "Position: %s, (%d) %.2f per item, total: %.2f".formatted(this.goodName, this.count, this.price, this.countWorth());
    }
}
