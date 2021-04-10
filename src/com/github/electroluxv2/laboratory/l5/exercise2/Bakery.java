package com.github.electroluxv2.laboratory.l5.exercise2;

import java.util.Arrays;

// W treści brak getterów i setterów więc final
final class Bakery extends Shop {
    private final String[] products;

    public Bakery(final String address, final int size, final String[] products) {
        super(address, size);
        this.products = products;
    }

    @Override
    public final String getInformation() {
        return "%s, products: %s".formatted(super.getInformation(), Arrays.toString(this.products));
    }
}
