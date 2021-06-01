package com.endava.datetypes;

import java.time.LocalDate;

public class FirstDayOfMonth {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate start = d.withDayOfMonth(2);
        System.out.println(d);
        System.out.println(start);
    }
}
