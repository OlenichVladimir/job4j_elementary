package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int p = 4;
        double k = 1;
        int expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K7Square0dot24() {
        int p = 3;
        double k = 7;
        double expected = 0.24;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}