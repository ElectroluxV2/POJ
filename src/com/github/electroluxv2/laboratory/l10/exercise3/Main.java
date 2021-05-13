package com.github.electroluxv2.laboratory.l10.exercise3;

public class Main {

    public static void main(final String[] args) {
        final Student student = new Student();
        student.addGrade("WPR", 2.0);
        System.out.println(student.getAvgGrade("WPR"));
        System.out.println(student.getAvgGrade("FIZ"));
    }
}
