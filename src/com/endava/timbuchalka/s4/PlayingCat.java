package com.endava.timbuchalka.s4;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return temperature >= 25 && (summer ? temperature <= 45 : temperature <= 35);
    }

}
