package com.github.electroluxv2.laboratory.l6.exercise1;

public enum Time {
    DAY(8),
    MONTH(DAY.getHours() * 30),
    YEAR(MONTH.getHours() * 365);

    private final int hours;

    Time(final int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}
