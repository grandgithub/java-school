package com.endava.timbuchalka.s3;

public class S3_55_TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}