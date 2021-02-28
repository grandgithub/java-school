package com.endava.timbuchalka.s4;

public class S4_61_AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5,4));
        System.out.println(area(-1,4));
    }

    public static double area(double radius) {
        return radius < 0 ? -1 : Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}
