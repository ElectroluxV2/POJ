package com.github.electroluxv2.laboratory.l3.Exercise6;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {

    private static final boolean CLEAR_ESCAPED = false;

    public static void main(String[] args) {
       String[] availableEnemies = { "Giorgio Giovanni", "Pan Twardeusz", "Marcin Najman", "Salvadore Ganacci", "Mateusz Morawiecki" };

        Scanner scanner = new Scanner(System.in);

        Weapon weapon = choiceWeapon(scanner);
        Armour armour = choiceArmour(scanner);
        Player player = new Player(weapon, armour);

        int chosenEnemy = choiceEnemy(scanner, availableEnemies);

        Random enemyChooser = new Random();
        // Enemies should be same every time
        enemyChooser.setSeed(stringToSeed(availableEnemies[chosenEnemy]));

        Weapon enemyWeapon = Weapon.randomChoose(enemyChooser);
        Armour enemyArmour = Armour.randomChoose(enemyChooser);
        Player enemy = new Player(enemyWeapon, enemyArmour);

        Random gameRandom = new Random();
        String[] summary = new String[2];
        while (enemy.alive() && player.alive()) {
            clearScreen();

            if (summary[0] != null) System.out.printf("\033[94m" + summary[0], availableEnemies[chosenEnemy]);
            if (summary[1] != null) System.out.printf("\033[94m" + summary[1], availableEnemies[chosenEnemy]);

            System.out.println();

            printPlayerSummary(enemy, availableEnemies[chosenEnemy]);
            printPlayerSummary(player, "You");

            System.out.println();

            summary[0] = enemy.autoChoice(player, gameRandom);
            summary[1] = makeMove(scanner, gameRandom, player, enemy);

        }

        clearScreen();

        if (summary[0] != null) System.out.printf("\033[94m" + summary[0], availableEnemies[chosenEnemy]);
        if (summary[1] != null) System.out.printf("\033[94m" + summary[1], availableEnemies[chosenEnemy]);

        System.out.println();
        if (enemy.alive()) {
            System.out.printf("\033[31m%s Won!%n", availableEnemies[chosenEnemy]);
        } else {
            System.out.println("\033[32mYou Won!");
        }
    }

    private static void printPlayerSummary(Player player, String prefix) {
        System.out.printf("\033[39m%-30s \033[91mHealth \033[35m%-15s \033[91mPower \033[35m%-15s%n", prefix, player.health, player.power);
    }

    private static String makeMove(Scanner scanner, Random random, Player player, Player enemy) {
        System.out.println("\033[91mPossible actions:");
        System.out.println("\033[35m0\033[38m - rest");
        System.out.println("\033[35m1\033[38m - attack");

        int choice = -1;
        while (choice < 0 || choice >= 2) {
            System.out.printf("%n\033[35mEnter Your Choice: (0 - %d): ", 1);
            choice = scanner.nextInt();
        }

        int value;
        if (choice == 0) {
            value = player.rest();
        } else {
            value = player.attack(enemy, random);
        }

        return (choice == 0 ? "You opted to gain more (" + value + ") power!%n" : "You dealt " + value + " damage to %s!%n");
    }

    private static int choiceEnemy(Scanner scanner, String[] availableEnemies) {
        int choice = -1;
        while (choice < 0 || choice >= availableEnemies.length) {
            clearScreen();
            // Bright Foreground Red
            System.out.printf("\033[91mChoose Your Enemy!%n%n");
            System.out.println("Available enemies:");
            System.out.printf("\033[35m# \033[91m\033[4m%-40s\033[24m%n", "Name:");

            for (int i = 0; i < availableEnemies.length; i++) {
                System.out.printf("\033[35m%d \033[91m\033[4m\033[38m%-40s\033[24m%n", i, availableEnemies[i]);
            }

            System.out.printf("%n\033[35mEnter Your Choice: (0 - %d): ", availableEnemies.length - 1);
            choice = scanner.nextInt();
        }

        return choice;
    }

    private static Armour choiceArmour(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice >= Armour.values().length) {
            clearScreen();
            // Bright Foreground Red
            System.out.printf("\033[91mCustomize Your Hero!%n%n");
            System.out.println("Available armour:");
            System.out.printf("\033[35m# \033[91m\033[4m%-20s%-10s%-10s\033[24m%n", "Name:", "Min PTS:", "Max PTS:");

            for (int i = 0; i < Armour.values().length; i++) {
                Armour armour = Armour.values()[i];
                System.out.printf("\033[35m%d \033[4m\033[38m%-20s%-10s%-10s\033[24m%n", i, armour, armour.getMinimumDefencePoints(), armour.getMaximumDefencePoints());
            }

            System.out.printf("%n\033[35mEnter Your Choice: (0 - %d): ", Armour.values().length - 1);
            choice = scanner.nextInt();
        }

        return Armour.values()[choice];
    }

    private static Weapon choiceWeapon(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice >= Weapon.values().length) {
            clearScreen();
            // Bright Foreground Red
            System.out.printf("\033[91mCustomize Your Hero!%n%n");
            System.out.println("Available weapons:");
            System.out.printf("\033[35m# \033[91m\033[4m%-20s%-10s%-10s\033[24m%n", "Name:", "Min DMG:", "Max DMG:");

            for (int i = 0; i < Weapon.values().length; i++) {
                Weapon weapon = Weapon.values()[i];
                System.out.printf("\033[35m%d \033[4m\033[38m%-20s%-10s%-10s\033[24m%n", i, weapon, weapon.getMinimumPower(), weapon.getMaximumPower());
            }

            System.out.printf("%n\033[35mEnter Your Choice: (0 - %d): ", Weapon.values().length - 1);
            choice = scanner.nextInt();
        }

        return Weapon.values()[choice];
    }

    public static long stringToSeed(String s) {
        // https://stackoverflow.com/questions/23981678/is-it-possible-to-use-a-string-as-a-seed-for-an-instance-random
        if (s == null) {
            return 0;
        }
        long hash = 0;
        for (char c : s.toCharArray()) {
            hash = 31L*hash + c;
        }
        return hash;
    }

    private static void clearScreen() {
        // https://docs.microsoft.com/en-us/windows/console/console-virtual-terminal-sequences
        //  printf(CSI "2J"); // Clear screen
        if (CLEAR_ESCAPED) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            return;
        }

        // https://intellij-support.jetbrains.com/hc/en-us/community/posts/360000723080-Clear-console-during-runtime
        String newlines = "\n";
        for (int i = 0; i < 5; i++) {
            newlines += newlines;
        }
        System.out.print(newlines);
    }
}



