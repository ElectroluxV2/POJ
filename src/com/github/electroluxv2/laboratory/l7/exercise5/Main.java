package com.github.electroluxv2.laboratory.l7.exercise5;

import com.github.electroluxv2.laboratory.l7.exercise7.Local;

public class Main {
    public static void main(final String[] args) {
        final Local l1 = new Local("Merapar Poland", "Arkońska 6, 80-387 Gdańsk");
        final Local l2 = new Local("CityFit", "aleja Grunwaldzka 472d, 80-309 Gdańsk");
        final Local l3 = new Local("Po Prostu Kwiaty", "Jana Kilińskiego 9/U2B, 80-452 Gdańsk");

        System.out.printf("%s%n%n%s%n%n%s%n%n", l1, l2, l3);
    }
}
