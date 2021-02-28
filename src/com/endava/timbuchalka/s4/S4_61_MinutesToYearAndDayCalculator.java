package com.endava.timbuchalka.s4;

public class S4_61_MinutesToYearAndDayCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        String result = "Invalid Value";
        if (minutes >= 0) {
            long years = minutes / 525600;
            long days = (minutes % 525600 / 1440);
            result = minutes + " min = " + years + " y and " + days + " d";
        }
        System.out.println(result);
    }
}
