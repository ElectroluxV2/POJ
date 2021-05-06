package com.github.electroluxv2.laboratory.l9.exercise4;

public class Main {

    public static void main(final String[] args) {
        MyList<Integer> integers = new MyList<>();

        for (int i = 0 ; i < 1000 && integers.add(i); i++) {
            assert (i == integers.get(i));
            System.out.println(integers.size());
        }
    }
}
