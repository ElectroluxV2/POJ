package com.github.electroluxv2.laboratory.l5.Exercise5;

abstract class B extends A {
    @Override
    protected void present(final String phrase) {
        super.present(phrase);
        System.out.printf("B: %s%n", phrase);
    }
}
