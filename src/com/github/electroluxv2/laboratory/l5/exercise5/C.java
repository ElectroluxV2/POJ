package com.github.electroluxv2.laboratory.l5.exercise5;

abstract class C extends B{
    @Override
    protected void present(final String phrase) {
        super.present(phrase);
        System.out.printf("C: %s%n", phrase);
    }
}
