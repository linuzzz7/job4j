package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void distance1() {
        int a = 6, b = 4, c = 7, d = 5;
        int expected = 7;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distance2() {
        int a = 1, b = 2, c = 4, d = 3;
        int expected = 4;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distance3() {
        int a = 1, b = 5, c = 2, d = 3;
        int expected = 5;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distance4() {
        int a = 10, b = 2, c = 1, d = 3;
        int expected = 10;
        int out = SqMax.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }
}