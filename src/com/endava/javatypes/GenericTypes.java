package com.endava.javatypes;

import java.text.DecimalFormat;

public class GenericTypes {

    public static void main(String[] args) {
        System.out.println(formatWithDecimals(123.5545,2));
        System.out.println(formatWithDecimals(500.00001,2));
    }

    public static <T extends Number> String formatWithDecimals(T amount, int fractionDigit) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(fractionDigit);
        return df.format(amount);
    }
}
