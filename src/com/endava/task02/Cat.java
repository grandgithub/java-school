package com.endava.task02;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public void makeASound() {
        System.out.println("Miau!");
    }

    @Override
    public void move() {
        System.out.println("Climb!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
