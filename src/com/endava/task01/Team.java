package com.endava.task01;

public abstract class Team {

    private String name;
    private int numberOfPlayers;
    private String talisman;
    private String country;

    public Team(String name, int numberOfPlayers, String talisman, String country) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.talisman = talisman;
        this.country = country;
        System.out.println("Creating new class of type: " + this.getClass().getName());
    }

    public abstract void signHymn();

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", talisman='" + talisman + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
