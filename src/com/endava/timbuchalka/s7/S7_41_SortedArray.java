package com.endava.timbuchalka.s7;

import java.util.Scanner;

public class S7_41_SortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] initialArray = getIntegers(5);
        int[] sortedArray = sortIntegers(initialArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int capacity) {
        int[] initialArray = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < capacity; i++) {
            initialArray[i] = scanner.nextInt();
        }
        return initialArray;
    }

    public static int[] sortIntegers(int[] initialArray) {
        int[] sortedArray = initialArray;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
