package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.DummyBot;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}