package com.github.electroluxv2.laboratory.l9.exercise2;

import java.util.Arrays;

public class Main {

    public static void main(final String[] args) {
        final Player[] players = new Player[]{
            new Player("DDDD", "AAAA", 2, 1.13),
            new Player("AABBCC", "DDEEFF", 1, 12.12),
            new Player("ABC", "DEF", 10, 13.13),
            new Player("AAAAAAA", "FFFFFF", 12, 12.13),
        };

        Arrays.sort(players);

        System.out.println(Arrays.toString(players));

        final Comparator comparator = new Comparator();

        Arrays.sort(players, comparator);

        System.out.println(Arrays.toString(players));
    }
}
