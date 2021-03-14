package com.endava.timbuchalka.s5;

public class S70_20_GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int result = -1;
        if (first >= 10 && second >= 10) {
            int biggest = Math.max(first, second);
            for (int i = 1; i <= biggest; i++) {
                if (first % i == 0 && second % i == 0) {
                    result = i;
                }
            }
        }
        return result;
    }
}
