package com.github.electroluxv2.laboratory.l3.exercise6;

import java.util.Random;

class Player {
    int health;
    int power = 1;

    Weapon weapon;
    Armour armour;

    public Player(Weapon weapon, Armour armour) {
        int multiplier = Math.abs(weapon.getWeight() - armour.getWeight()) + 1;
        this.health = 20 * multiplier;
        this.weapon = weapon;
        this.armour = armour;
    }

    public boolean alive() {
        return this.health > 0;
    }

    public int attack(Player other, Random random) {
        int enemyDefencePoints = other.armour.getDefencePoints(random);
        int playerAttackPower = this.weapon.getPower(random);

        int damage = (playerAttackPower * this.power) - enemyDefencePoints;
        //System.out.println("\033[94mAP: " +playerAttackPower + " pow: " + this.power + " df: " + enemyDefencePoints);
        if (damage < 0) damage = 0;

        other.SubtractHealth(damage);
        this.power = 1;

        return damage;
    }

    private void SubtractHealth(int damage) {
        this.health -= damage;
    }

    public int rest() {
        int value = this.health / this.armour.getWeight() / 10;
        if (value <= 0) value = 1;
        this.power += value;

        return value;
    }

    public String autoChoice(Player other, Random random) {
        int enemyDefencePoints = other.armour.getMaximumDefencePoints();
        int attackPower = this.weapon.getMinimumPower();
        //System.out.println("\033[94mAC: AP: " + attackPower * this.power + " df: " + enemyDefencePoints);
        boolean canAttack = (attackPower * this.power) - enemyDefencePoints > 0;

        if (canAttack && random.nextBoolean()) {
            return "%s dealt You " + this.attack(other, random) + " damage!%n";
        } else {
            return "%s opted to gain more (" + this.rest() + ") power!%n";
        }
    }

}
