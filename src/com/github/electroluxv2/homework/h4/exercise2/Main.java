package com.github.electroluxv2.homework.h4.exercise2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game(10, 20, 5);
        game.mainLoop();
    }
}
