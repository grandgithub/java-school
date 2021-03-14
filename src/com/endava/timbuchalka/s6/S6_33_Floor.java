package com.endava.timbuchalka.s6;

public class S6_33_Floor {
}

class Floor {
    private final double width;
    private final double length;

    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 :length;
    }

    public double getArea() {
        return width * length;
    }
}

class Carpet {
    private final double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}

class Calculator {
    private final Floor floor;
    private final Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}