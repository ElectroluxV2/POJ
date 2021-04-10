package com.github.electroluxv2.homework.h4.exercise4;

import java.util.Random;

public class Coin {
    public enum Side { TAILS, EAGLE }
    public Side flip(Random random) {
        return random.nextBoolean() ? Side.TAILS : Side.EAGLE;
    }
}
