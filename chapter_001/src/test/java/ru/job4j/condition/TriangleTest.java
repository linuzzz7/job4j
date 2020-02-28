package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 3);
        Point third = new Point(4, 5);
        Triangle tri = new Triangle(first, second, third);
        boolean result = tri.exist(first.distance(second), second.distance(third), third.distance(first));
        assertThat(result, is(true));
    }

    @Test
    public void doesNotExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Point third = new Point(0, 0);
        Triangle tri = new Triangle(first, second, third);
        boolean result = tri.exist(first.distance(second), second.distance(third), third.distance(first));
        assertThat(result, is(false));
    }

    @Test
    public void perimeter() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 3);
        Point third = new Point(4, 5);
        Triangle tri = new Triangle(first, second, third);
        double result = tri.period(first.distance(second), second.distance(third), third.distance(first));
        double expected = 6.58;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void area() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 3);
        Point third = new Point(4, 5);
        Triangle tri = new Triangle(first, second, third);
        double result = tri.area(first.distance(second), second.distance(third), third.distance(first));
        double expected = 3.5;
        Assert.assertEquals(expected, result, 0.01);
    }
}