package com.endava.timbuchalka.s5;

public class S70_18_ShareDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        boolean result = false;
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            int digit1 = num1 % 10;
            int digit2 = num1 / 10;
            int digit3 = num2 % 10;
            int digit4 = num2 / 10;
            if (digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4) {
                result = true;
            }
        }
        return result;
    }
}
