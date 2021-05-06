package com.github.electroluxv2.laboratory.l9.exercise2;

public class Player implements Comparable<Player> {
    String firstname;
    String lastname;
    Integer ranking;
    Double maxSpeed;

    public Player(final String firstname, final String lastname, final Integer ranking, final Double maxSpeed) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ranking = ranking;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "%s %s R: %d MS: %.2f".formatted(this.firstname, this.lastname, this.ranking, this.maxSpeed);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getRanking() {
        return ranking;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public void setRanking(final Integer ranking) {
        this.ranking = ranking;
    }

    public void setMaxSpeed(final Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(final Player other) {
        if (this.firstname.compareTo(other.firstname) != 0) {
            return this.firstname.compareTo(other.firstname);

        } else if (this.lastname.compareTo(other.lastname) != 0) {

            return this.lastname.compareTo(other.lastname);
        } else {

            return this.ranking.compareTo(other.ranking);
        }
    }
}
