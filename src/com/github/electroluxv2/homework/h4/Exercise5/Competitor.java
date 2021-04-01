package com.github.electroluxv2.homework.h4.Exercise5;

import java.util.Random;

import static com.github.electroluxv2.laboratory.l3.Exercise6.Exercise6.stringToSeed;

public class Competitor {
    private final Random random = new Random();
    private final String name;
    private final int minimumSpeed;
    private final int maximumSpeed;
    private int distance = 0;

    public Competitor(String name, int minimumSpeed, int maximumSpeed) {
        this.name = name;
        this.minimumSpeed = minimumSpeed;
        this.maximumSpeed = maximumSpeed;

        // Same results
        this.random.setSeed(stringToSeed(this.name));
    }

    public void sayMyName() {
        System.out.printf("No, no, no, focus. Speed. Faster than fast, quicker than quick. I am %s. My maximum speed is: %d, but I might be as slow as %d.%n.", this.name, this.maximumSpeed, this.minimumSpeed);
    }

    public void runCompetitorRunAsRandomlyYouCan() {
        this.distance += this.random.nextInt(this.maximumSpeed - this.minimumSpeed) + this.minimumSpeed;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
