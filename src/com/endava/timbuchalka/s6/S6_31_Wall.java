package com.endava.timbuchalka.s6;

public class S6_31_Wall {
}

class Wall1 {
    private double width;
    private double height;

    public Wall1() {
    }

    public Wall1(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}
