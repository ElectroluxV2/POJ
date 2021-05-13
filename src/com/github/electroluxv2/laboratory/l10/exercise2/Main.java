package com.github.electroluxv2.laboratory.l10.exercise2;

import com.github.electroluxv2.laboratory.l9.exercise2.Comparator;
import com.github.electroluxv2.laboratory.l9.exercise2.Player;

import java.util.Arrays;

public class Main {

    public static void main(final String[] args) {
        final Student student = new Student();
        student.addGrade(1.0);
        student.addGrade(2.0);
        student.addGrade(3.0);
        student.addGrade(4.0);
        student.addGrade(5.0);

        System.out.println(student.getAvgGrade());
    }
}
