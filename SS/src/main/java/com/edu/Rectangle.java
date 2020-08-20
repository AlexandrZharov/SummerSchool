package com.edu;

import java.util.logging.Logger;

public class Rectangle {
    private double width, height;
    private final static Logger LOGGER = Logger.getLogger(Rectangle.class.getName());

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        LOGGER.info("Test info getArea()");
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }
}
