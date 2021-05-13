package com.github.electroluxv2.laboratory.l10.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final List<Double> grades = new ArrayList<>();

    public void addGrade(Double grade) {
        this.grades.add(grade);
    }

    public Double getAvgGrade() {
        double sum = this.grades.stream().mapToDouble(Double::doubleValue).sum();
        return sum / this.grades.size();
    }
}
