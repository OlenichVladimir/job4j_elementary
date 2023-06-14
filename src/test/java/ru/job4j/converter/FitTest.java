package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan176Then87dot39() {
        short in = 176;
        double expected = 87.39;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman173Then72dot44() {
        short in = 173;
        double expected = 72.44;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}