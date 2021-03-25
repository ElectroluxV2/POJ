package com.github.electroluxv2.laboratory.l3.Exercise6;

import java.util.Random;

enum Weapon {
    FIST(1, 3),
    KNIFE(2, 6),
    SPEAR(8, 10);

    private final int minimumPower;
    private final int maximumPower;

    Weapon(int minimumPower, int maximumPower) {
        this.minimumPower = minimumPower;
        this.maximumPower = maximumPower;
    }

    public static Weapon randomChoose(Random random) {
        return Weapon.values()[random.nextInt(Weapon.values().length)];
    }

    public int getMinimumPower() {
        return this.minimumPower;
    }

    public int getMaximumPower() {
        return this.maximumPower;
    }

    public int getPower(Random random) {
        // https://stackoverflow.com/a/363692/7132461
        // https://stackoverflow.com/questions/39833270/threadlocalrandom-setseed
        // https://stackoverflow.com/a/363691/7132461
        return random.nextInt(this.maximumPower + 1 - this.minimumPower) + this.minimumPower;
    }

    public int getWeight() {
        return minimumPower + maximumPower + 1;
    }
}