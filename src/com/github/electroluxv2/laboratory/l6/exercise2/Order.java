package com.github.electroluxv2.laboratory.l6.exercise2;

import java.util.ArrayList;

public class Order {
    private final ArrayList<Position> positions;
    private final int maximumSize;

    public Order(final ArrayList<Position> positions, final int maximumSize) {
        this.positions = positions;
        this.maximumSize = maximumSize;
    }

    public Order(final ArrayList<Position> positions) {
        this(positions, 10);
    }

    public void addPosition(final Position position) {
        if (this.positions.size() == maximumSize) { return; }
        this.positions.add(position);
    }

    @Override
    public String toString() {
        return "Order consists of: %s".formatted(this.positions.toString());
    }
}
