package com.endava.timbuchalka.s3;

public class S3_57_LeapYearCalculator {

    public static void main(String[] args) {
        System.out.println("1700 is leap year " + isLeapYear(1700));
        System.out.println("1800 is leap year " + isLeapYear(1800));
        System.out.println("1900 is leap year " + isLeapYear(1900));
        System.out.println("2100 is leap year " + isLeapYear(2100));
        System.out.println("1600 is leap year " + isLeapYear(1600));
        System.out.println("2000 is leap year " + isLeapYear(2000));
        System.out.println("2400 is leap year " + isLeapYear(2400));
        System.out.println("1924 is leap year " + isLeapYear(1924));
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
}
