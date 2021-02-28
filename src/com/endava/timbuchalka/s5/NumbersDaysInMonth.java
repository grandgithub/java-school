package com.endava.timbuchalka.s5;

public class NumbersDaysInMonth {

    public static void main(String[] args) {
//        for (int i=-1;i<14; i++) {
//            System.out.println(getDaysInMonth(i,10000));
//        }
        System.out.println(getDaysInMonth(12,10000));
    }

    public static boolean isLeapYear(int year) {
        boolean result = year >= 1 && year <= 9999;
        if (result) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 > 0) {
                        result = false;
                    }
                }
            } else {
                result = false;
            }
        }
        return result;
    }

    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }
        days = month < 1 || month > 12 || year < 1 || year > 9999 ? -1 : days;
        return days;
    }
}
