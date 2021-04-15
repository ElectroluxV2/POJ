package com.github.electroluxv2.laboratory.l6.exercise1;

public class Main {
    public static void main(final String[] args) {
        final Company company = new Company(new Worker[] {
           new Worker("Krzysztof", "Pawłowski", 60),
           new Worker("Maciej", "Kroplewski", 60),
           new Worker("Robert", "Dittmann", 120),
           new Worker("Maciej", "Debicki", 80),
           new Worker("Radosław", "Dittmann", 80),
           new Worker("Tymoteusz", "Gach", 60),
        });

        System.out.printf("Yearly cost: %.2f%n", company.calcYearlyCost());
        System.out.printf("Monthly cost: %.2f%n", company.calcMonthlyCost());
        System.out.printf("Daily cost: %.2f%n", company.calcCost(Time.DAY));
        System.out.printf("3 day cost: %.2f%n", company.calcCost(Time.DAY, 3));
    }
}
