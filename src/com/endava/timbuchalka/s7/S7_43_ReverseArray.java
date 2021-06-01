package com.endava.timbuchalka.s7;

import java.util.Arrays;

public class S7_43_ReverseArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 7, 15, 2, 85};
        System.out.println("Initial array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Initial array: " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int temp;
        for (int i=0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
