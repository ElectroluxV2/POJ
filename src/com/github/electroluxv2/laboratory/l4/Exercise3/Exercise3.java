package com.github.electroluxv2.laboratory.l4.Exercise3;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise3 {

    public static void main(String[] args) throws Exception {

        HashMap<Colour, ArrayList<Card>> tackle = new HashMap<Colour, ArrayList<Card>>() {};
        for (Colour colour : Colour.values()) {

            ArrayList<Card> cardArrayList = new ArrayList<>();

            for (Figure figure : Figure.values()) {
                Card card = new Card(colour, figure);
                cardArrayList.add(card);

                System.out.println(card);
            }

            tackle.put(colour, cardArrayList);
        }
    }
}