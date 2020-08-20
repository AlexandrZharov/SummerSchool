package com.edu;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class CubeTest {

    private final static Logger LOGGER = Logger.getLogger(CubeTest.class.getName());
    Cube cube = new Cube(3);

    @Test
    public void whenSide3GetSideArea() {
        LOGGER.info("getSideArea method test");
        Assert.assertEquals(cube.getSideArea(), 9, 0.01);
    }

    @Test
    public void whenSide3GetSidePerimeter() {
        LOGGER.info("getSidePerimeter method test");
        Assert.assertEquals(cube.getSidePerimeter(), 12, 0.01);
    }

    @Test
    public void whenSide3GetVolume() {
        LOGGER.info("getVolume method test");
        Assert.assertEquals(cube.getVolume(), 27, 0.01);
    }
}
