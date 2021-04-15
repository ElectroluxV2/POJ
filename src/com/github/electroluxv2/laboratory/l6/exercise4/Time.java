package com.github.electroluxv2.laboratory.l6.exercise4;

public class Time {
    private final int hours;
    private final int minutes;

    public Time(final int hours, final int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "%dh %dmin".formatted(this.hours, this.minutes);
    }

    public Time add(final Time time) {
        final int addedHours = (this.minutes + time.minutes) / 60;
        return new Time(this.hours + time.hours + addedHours, (this.minutes + time.minutes) % 60);
    }

    public Time multiply(final int times) {
        final int addedHours = (this.minutes * times) / 60;
        return new Time(this.hours * times + addedHours, (this.minutes * times) % 60);
    }
}
