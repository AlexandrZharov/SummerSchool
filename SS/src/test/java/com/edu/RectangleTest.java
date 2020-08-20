package com.edu;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(3, 4);

    @Test
    public void whenH4W3GetArea() {
        Assert.assertEquals(12, rectangle.getArea(), 0.01);
    }

    @Test
    public void whenH4W3GetPerimeter() {
        Assert.assertEquals(14, rectangle.getPerimeter(), 0.01);
    }
}
