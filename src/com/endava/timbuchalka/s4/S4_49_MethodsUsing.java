package com.endava.timbuchalka.s4;

public class S4_49_MethodsUsing {

    public static void main(String[] args) {
        displayHighScorePosition("Mike", 1500);
        displayHighScorePosition("Jake", 900);
        displayHighScorePosition("Jim", 400);
        displayHighScorePosition("Kate", 50);
    }

    public static void displayHighScorePosition(String playerName, int score) {
        System.out.println("Player " + playerName +
                " managed to get into position: " +
                calculateHighScorePosition(score));
    }

    public static byte calculateHighScorePosition(int score) {
        byte position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position =  3;
        }

        return position;
    }
}
