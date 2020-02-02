package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void distance1() {
        int a = 6, b = 4, c = 7, d = 5;
        int expected = 5;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distance2() {
        int a = 6, b = 7, c = 3, d = 5;
        int expected = 6;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distance3() {
        int a = 2, b = 4, c = 7, d = 5;
        int expected = 4;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distance4() {
        int a = 9, b = 4, c = 7, d = 5;
        int expected = 7;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }
}
