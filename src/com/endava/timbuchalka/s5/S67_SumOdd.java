package com.endava.timbuchalka.s5;

public class S67_SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > end || start < 0 || end < 0) {
            sum = -1;
        } else {
            for (int i=start; i<=end; i++) {
                sum += isOdd(i) ? i : 0;
            }
        }
        return sum;
    }
}
