package com.endava.task01;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

    public static void main(String[] args) {
        List<Team> club = new ArrayList<>();
        club.add(new Football("Real Madrid",15, "bull","Spain"));
        club.add(new Football("Liverpool FC",20, "","Spain"));
        club.forEach(team -> {
            System.out.println(team);
            team.signHymn();
        });
    }

}
