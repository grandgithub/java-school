package com.endava;

import java.util.ArrayList;
import java.util.List;

public class AddEmpyListToAnother {
    public static void main(String[] args) {
        List<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        initialList.add(2);
        initialList.add(3);
        System.out.println(initialList);
        List<Integer> addedList = new ArrayList<>();
        addedList.add(4);
        initialList.addAll(addedList);
        System.out.println(initialList);
    }
}
