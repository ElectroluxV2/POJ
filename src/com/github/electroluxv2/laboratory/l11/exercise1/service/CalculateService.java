package com.github.electroluxv2.laboratory.l11.exercise1.service;

public class CalculateService {
    public double convertCtoF(final double c) {
        return Math.round(c / 5 * 9 + 32);
    }

    public double convertFtoC(final double f) {
        return Math.round((f - 32) * 5 / 9);
    }
}
