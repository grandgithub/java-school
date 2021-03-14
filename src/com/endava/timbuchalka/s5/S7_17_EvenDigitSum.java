package com.endava.timbuchalka.s5;

public class S7_17_EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(10));
    }

    public static int getEvenDigitSum(int number) {
        int result = 0;
        if (number<0) {
            result = -1;
        } else {
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    result = result + digit;
                }
                number = number / 10;
            }
        }
        return result;
    }
}
