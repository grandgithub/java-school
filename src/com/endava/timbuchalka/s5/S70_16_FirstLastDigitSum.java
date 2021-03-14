package com.endava.timbuchalka.s5;

public class S70_16_FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int result = 0;
        if (number < 0) {
            result = -1;
        } else {
            result = number % 10;
            while (number > 9) {
                number = number / 10;
            }
            result = result + number;
        }
        return result;
    }
}
