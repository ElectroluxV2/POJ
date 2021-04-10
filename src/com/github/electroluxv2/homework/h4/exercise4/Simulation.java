package com.github.electroluxv2.homework.h4.exercise4;

import java.util.HashMap;
import java.util.Random;

public class Simulation {
    private static final Random random = new Random();
    private static final Coin coin = new Coin();
    private final int throwsCount;
    // https://stackoverflow.com/questions/81346/most-efficient-way-to-increment-a-map-value-in-java
    private static class MutableInt {
        int value = 0;
        public void increment () { ++value; }
        public int get (){ return value; }
    }
    private final HashMap<Coin.Side, MutableInt> probes = new HashMap<>();

    public Simulation(int throwsCount) {
        this.throwsCount = throwsCount;
        this.probes.put(Coin.Side.EAGLE, new MutableInt());
        this.probes.put(Coin.Side.TAILS, new MutableInt());
    }

    public Simulation emulate() {
        for (int probe = 0; probe < this.throwsCount; probe++) {
            this.probes.get(Simulation.coin.flip(Simulation.random)).increment();
        }

        return this;
    }

    public Simulation printResults() {
        int tailsPercentage = (int)(((float) this.probes.get(Coin.Side.TAILS).get() / this.throwsCount) * 100);
        int eaglePercentage = (int)(((float) this.probes.get(Coin.Side.EAGLE).get() / this.throwsCount) * 100);

        System.out.printf("%d%% Tails | %d%% Eagle | %d probes total.%n", tailsPercentage, eaglePercentage, this.throwsCount);
        return this;
    }
}
