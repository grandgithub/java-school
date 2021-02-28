package com.endava.timbuchalka.s4;

public class S4_61_EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int num1, int num2, int num3) {
        String result;
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            result = "Invalid Value";
        } else if (num1 == num2 && num2 == num3) {
            result = "All numbers are equal";
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            result = "All numbers are different";
        } else {
            result = "Neither all are equal or different";
        }
        System.out.println(result);
    }
}
