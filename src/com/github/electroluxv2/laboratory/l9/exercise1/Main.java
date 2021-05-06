package com.github.electroluxv2.laboratory.l9.exercise1;

public class Main {

    public static void main(final String[] args) {
        MyList<Integer> integers = new MyList<>();

        integers.add(1);
        integers.add(2);
        integers.add(1);

        System.out.printf("First: %d, Last: %d%n", integers.indexOf(1), integers.lastIndexOf(1));

        MyList<String> strings = new MyList<>();

        strings.add("aaa");

        if (strings.contains("aaa")) {
            System.out.println("Contains aaa");
        }

        if (!strings.contains("bbb")) {
            System.out.println("Not contains bbb");
        }
    }
}
