package com.github.electroluxv2.homework.h4.exercise5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Competitor competitor1 = new Competitor("Lightning McQueen", -5, 15);
        Competitor competitor2 = new Competitor("Forrest Gump", 0, 10);

        ArrayList<Competitor> competitors = new ArrayList<Competitor>() {{
            add(competitor1);
            add(competitor2);
        }};

        Race race = new Race(competitors);
        race.simulation().printResults();
    }
}
