package com.endava.timbuchalka.s5;

public class S70_20_NumberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digits = getDigitCount(number);
            number = reverse(number);
            for (int i = 0; i < digits; i++) {
                int digit = number % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number = number / 10;
            }
        }
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -1 * number;
        }
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        reversed = isNegative ? -1 * reversed : reversed;
        return reversed;
    }

    public static int getDigitCount(int number) {
        int digits = 0;
        if (number < 0) {
            digits = -1;
        } else {
            do {
                digits++;
                number = number / 10;
            } while (number > 0);
        }
        return digits;
    }
}
