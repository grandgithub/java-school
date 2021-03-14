package com.endava.timbuchalka.s5;

public class S71_24_FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(2, 10, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result = false;
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int neededBigBags = bigCount > 0 ? goal / 5 : 0;
            neededBigBags = Math.min(neededBigBags, bigCount);
            int neededSmallBags = goal - neededBigBags * 5;
            int expectedSum = neededBigBags * 5 + neededSmallBags;
            if (expectedSum <= goal && neededSmallBags <= smallCount) {
                result = true;
            }
        }
        return result;
    }
}
