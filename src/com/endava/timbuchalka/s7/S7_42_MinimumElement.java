package com.endava.timbuchalka.s7;

import java.util.Scanner;

public class S7_42_MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int capacity = readInteger();
        int[] integers = readElements(capacity);
        System.out.println("Minimum value is: " + findMin(integers));
    }

    public static int readInteger() {
        System.out.println("How many integers do you want do enter?");
        return scanner.nextInt();
    }

    public static int[] readElements(int capacity) {
        int[] initialArray = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < capacity; i++) {
            initialArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return initialArray;
    }

    private static int findMin(int[] integers) {
        int minimalInt = integers[0];
        for (int value : integers) {
            minimalInt = Math.min(minimalInt, value);
        }
        return minimalInt;
    }
}
