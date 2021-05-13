package com.github.electroluxv2.laboratory.l10.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private final Map<String, List<Double>> grades = new HashMap<>();

    public void addGrade(String course, Double grade) {
        this.grades.computeIfAbsent(course, k -> new ArrayList<>());
        this.grades.get(course).add(grade);
    }

    public Double getAvgGrade(String course) {
        double sum = this.grades.getOrDefault(course, new ArrayList<>()).stream().mapToDouble(Double::doubleValue).sum();
        return sum / this.grades.size();
    }
}
