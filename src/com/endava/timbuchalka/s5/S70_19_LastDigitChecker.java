package com.endava.timbuchalka.s5;

public class S70_19_LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 41));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        boolean result = false;
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;
            if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
