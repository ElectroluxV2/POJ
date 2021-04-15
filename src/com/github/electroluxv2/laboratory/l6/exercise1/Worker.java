package com.github.electroluxv2.laboratory.l6.exercise1;

public class Worker {
    private final String name;
    private final String surname;
    private final double salary;

    public Worker(final String name, final String surname, final double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
