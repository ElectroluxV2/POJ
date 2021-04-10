package com.github.electroluxv2.laboratory.l3.exercise6;

import java.util.Random;

enum Armour {
    CALTROPS(0, 2),
    SHIELD(6, 8),
    IRON_MAIDEN(0, 20);

    private final int minimumDefencePoints;
    private final int maximumDefencePoints;

    Armour(int minimumDefencePoints, int maximumDefencePoints) {
        this.minimumDefencePoints = minimumDefencePoints;
        this.maximumDefencePoints = maximumDefencePoints;
    }

    public static Armour randomChoose(Random random) {
        return Armour.values()[random.nextInt(Armour.values().length)];
    }

    public int getMinimumDefencePoints() {
        return minimumDefencePoints;
    }

    public int getMaximumDefencePoints() {
        return maximumDefencePoints;
    }

    public int getDefencePoints(Random random) {
        return random.nextInt(this.maximumDefencePoints + 1 - this.minimumDefencePoints) + this.minimumDefencePoints;
    }

    public int getWeight() {
        return minimumDefencePoints + maximumDefencePoints + 1;
    }
}