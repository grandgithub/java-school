package com.endava.task02;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void makeASound();

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
