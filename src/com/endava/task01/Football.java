package com.endava.task01;

public class Football extends Team {

    public Football(String name, int numberOfPlayers, String talisman, String country) {
        super(name, numberOfPlayers, talisman, country);
    }

    @Override
    public void signHymn() {
        System.out.println("Ola-ola-ola-ola!!!");
    }

    public void signHymn(String country) {
        System.out.println("Ola-ola-ola-ola!!! for the country " + country);
    }
}
