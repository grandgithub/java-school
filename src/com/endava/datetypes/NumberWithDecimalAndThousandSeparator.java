package com.endava.datetypes;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberWithDecimalAndThousandSeparator {

    public static void main(String[] args) {
//        double number = 5123456789.0;
//        DecimalFormat df = new DecimalFormat("###,###.##");
//        df.setMinimumFractionDigits(2);
//        System.out.println(df.format(number));

        BigDecimal test = BigDecimal.valueOf(12051);
        BigDecimal result = test.divide(BigDecimal.valueOf(100),2, BigDecimal.ROUND_UP);
        BigDecimal result1 = test.divide(BigDecimal.valueOf(100),2, BigDecimal.ROUND_CEILING);
        System.out.println(result);
        System.out.println(result1);
    }

}
