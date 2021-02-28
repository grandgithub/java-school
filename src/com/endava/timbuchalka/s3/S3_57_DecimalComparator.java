package com.endava.timbuchalka.s3;

public class S3_57_DecimalComparator {

    public static void main(String[] args) {
        System.out.printf("Numbers %s and %s are equal by three decimal numbers: " +
                areEqualByThreeDecimalPlaces(3.174, 3.175) + "%n", 3.174, 3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return Math.abs(num1 - num2) < 0.0009d;
    }
}
