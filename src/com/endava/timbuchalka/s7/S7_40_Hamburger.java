package com.endava.timbuchalka.s7;

public class S7_40_Hamburger {

    public static void main(String[] args) {

    }
}

class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
    }

    public double itemizehumburger() {
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }
}

class HealthyBurger {

}