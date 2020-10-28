package com.endava.task02;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public void makeASound() {
        System.out.println("Gav-gav!");
    }

    @Override
    public void move() {
        System.out.println("Run!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
