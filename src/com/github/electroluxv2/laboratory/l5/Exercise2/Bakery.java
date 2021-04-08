package com.github.electroluxv2.laboratory.l5.Exercise2;

import java.util.Arrays;

// W treści brak getterów i setterów więc final
public final class Bakery extends Shop {
    private final String[] products;

    public Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    @Override
    public final String getInformation() {
        return "%s, products: %s".formatted(super.getInformation(), Arrays.toString(this.products));
    }
}
