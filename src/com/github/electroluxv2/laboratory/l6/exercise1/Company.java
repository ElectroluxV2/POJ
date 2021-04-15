package com.github.electroluxv2.laboratory.l6.exercise1;

public class Company {
    private final Worker[] workers;

    public Company(final Worker[] workers) {
        this.workers = workers;
    }

    public double calcMonthlyCost() {
        int hoursInMonth = 30 * 8;
        return this.calcCost(hoursInMonth);
    }

    public double calcYearlyCost() {
        int hoursInYear = 12 * 30 * 8;
        return this.calcCost(hoursInYear);
    }

    public double calcCost(final Time period) {
        return this.calcCost(period.getHours());
    }

    public double calcCost(final Time period, final int times) {
        return this.calcCost(period.getHours() * times);
    }

    private double calcWorkerCost(final Worker worker, final int hours) {
        return worker.getSalary() * hours;
    }

    private double calcCost(final int hours) {
        double cost = 0;

        for (Worker worker : this.workers) {
            cost += this.calcWorkerCost(worker, hours);
        }

        return cost;
    }
}
