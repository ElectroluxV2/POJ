package com.github.electroluxv2.laboratory.l6.exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        final Order order = new Order(new ArrayList<>());
        order.addPosition(new Position("bred", 2, 2));
        order.addPosition(new Position("banana", 1, 6));

        System.out.printf("Your order: %s", order);
    }
}
