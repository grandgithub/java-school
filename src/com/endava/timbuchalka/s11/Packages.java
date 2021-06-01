package com.endava.timbuchalka.s11;

import com.javaschool.numfuncs.Series;

public class Packages {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println("Sum[" + i + "] = " + Series.nSum(i));
        }
        System.out.println("========");
        for (int i = 0; i < 11; i++) {
            System.out.println("factorial[" + i + "] = " + Series.factorial(i));
        }
        System.out.println("========");
        for (int i = 0; i < 11; i++) {
            System.out.println("fibonacci[" + i + "] = " + Series.fibonacci(i));
        }
    }
}
