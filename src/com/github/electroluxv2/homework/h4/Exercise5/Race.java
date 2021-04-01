package com.github.electroluxv2.homework.h4.Exercise5;

import java.util.ArrayList;

public class Race {
    private final ArrayList<Competitor> competitors;
    private String winnerName = null;

    public Race(ArrayList<Competitor> competitors) {
        this.competitors = competitors;
    }

    public Race simulation() {
       while (this.winnerName == null) {
           for (Competitor competitor : this.competitors) {
               competitor.runCompetitorRunAsRandomlyYouCan();
               if (competitor.getDistance() >= 50) {
                   this.winnerName = competitor.getName();
                   break;
               }
           }
       }

       return this;
    }

    public Race printResults() {
        System.out.printf("The winner is %s!%n", this.winnerName);
        return this;
    }

}
