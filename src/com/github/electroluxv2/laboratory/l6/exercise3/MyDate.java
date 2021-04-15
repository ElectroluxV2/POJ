package com.github.electroluxv2.laboratory.l6.exercise3;

import java.text.DateFormatSymbols;

public class MyDate {
    private final int days;
    private final int months;
    private final int years;

    public MyDate(final int days, final int months, final int years) {
        this.days = days;
        this.months = months;
        this.years = years;
    }

    /*@Override
    public String toString() {
        return "%d.%d.%d".formatted(this.days, this.months, this.years);
    }*/


    /*@Override
    public String toString() {
        return "%02d.%02d.%04d".formatted(this.days, this.months, this.years);
    }*/

    @Override
    public String toString() {
        return "%d %s %d".formatted(this.days,  new DateFormatSymbols().getShortMonths()[this.months - 1], this.years);
    }
}
