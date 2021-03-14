package com.endava.timbuchalka.s5;

public class S70_NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int initialNumber = number;
        int reverseNumber = 0;
        while (number !=0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;
        }
        return initialNumber == reverseNumber && initialNumber != 0;
    }
}
