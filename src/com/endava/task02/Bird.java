package com.endava.task02;

public class Bird extends Animal {

    Bird(String name) {
        super(name);
    }

    @Override
    public void makeASound() {
        System.out.println("Car-car!");
    }

    @Override
    public void move() {
        System.out.println("Fly!");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
