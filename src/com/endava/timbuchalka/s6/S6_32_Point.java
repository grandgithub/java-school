package com.endava.timbuchalka.s6;

public class S6_32_Point {
}

class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int m, int n) {
        return Math.sqrt((m - x) * (m - x) + (n - y) * (n - y));
    }

    public double distance(Point anotherPoint) {
        return Math.sqrt((anotherPoint.getX()-x) * (anotherPoint.getX()-x) +
                (anotherPoint.getY() - y) * (anotherPoint.getY() - y));
    }
}
