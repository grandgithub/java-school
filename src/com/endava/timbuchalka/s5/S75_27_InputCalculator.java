package com.endava.timbuchalka.s5;

import java.util.Scanner;

public class S75_27_InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter an integer value:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }
        average = count != 0 ? Math.round(sum / count) : 0;
        System.out.println("SUM = " + (int) sum + " AVG = " + (int) average);
    }
}
