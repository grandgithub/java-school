package com.endava.timbuchalka.s4;

public class S4_60_SecondsMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(121, 23));
        System.out.println(getDurationString(3670));
    }

    public static String getDurationString(int minutes, int seconds) {
        String result = "";
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            result = "Invalid value";
        } else {
            result = (minutes / 60) + "h " + minutes % 60 + "m " + seconds + "s";
        }
        return result;
    }

    public static String getDurationString(int seconds) {
        String result = "";
        if (seconds < 0) {
            result = "Invalid value";
        } else {
            int hours = seconds / 3600;
            int minutes = (seconds - hours * 3600) / 60;
            result = hours + "h " + minutes + "m " + (seconds - hours * 3600 - minutes * 60) + "s";
        }
        return result;
    }
}
