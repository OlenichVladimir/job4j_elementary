package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int x2 = 0;
        int x1 = 0;
        int y2 = 2;
        int y1 = 0;
        double expected = 2;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when98to76then141() {
        int x2 = 9;
        int x1 = 8;
        int y2 = 7;
        int y1 = 6;
        double expected = 1.41;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then141() {
        int x2 = 1;
        int x1 = 2;
        int y2 = 3;
        int y1 = 4;
        double expected = 1.41;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to24then282() {
        int x2 = 1;
        int x1 = 3;
        int y2 = 2;
        int y1 = 4;
        double expected = 2.82;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.01);
    }
}