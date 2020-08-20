package com.edu;

import java.util.logging.Logger;

public class Cube {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube(double side) {
        this.side = side;
    }

    public double getSideArea() {
        return this.side * this.side;
    }

    public double getSidePerimeter() {
        return 4 * this.side;
    }

    public double getVolume() {
        return getSideArea() * this.side;
    }
}
