package com.github.electroluxv2.laboratory.l8.exercise7;

import java.util.ArrayList;

public class Main {

    public static void main(final String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>() {{
            add(new Square(2));
            add(new Rect(2, 3));
            add(new Triangle(3, 4, 5));
        }};

        for (final Shape shape : shapes) {
            System.out.printf("%s: area: %.2f, circumference: %.2f%n", shape.getClass().getSimpleName(), shape.calcArea(), shape.calcCircumference());
        }
    }
}
