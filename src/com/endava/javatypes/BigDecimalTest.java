package com.endava.javatypes;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal number = BigDecimal.valueOf(10000);
        System.out.println(number.divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_UP));
    }
}
