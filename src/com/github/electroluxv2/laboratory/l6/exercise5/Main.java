package com.github.electroluxv2.laboratory.l6.exercise5;

public class Main {
    public static void main(final String[] args) {
        final BWM bwm = new BWM("Red", 2000);
        for (int i = 0; i < 10; i++) {
            System.out.println(bwm);
            bwm.accelerate();
        }
    }
}
