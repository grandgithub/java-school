package com.endava.timbuchalka.s3;

public class S3_57_BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(true, 24));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23) && barking;
    }
}
