package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void toMax1() {
        boolean result = Max.maxFirst(3, 1);
        assertThat(result, is(true));
    }

    @Test
    public void toMax2() {
        boolean result = Max.maxSecond(2, 5);
        assertThat(result, is(true));
    }

    @Test
    public void toQuals() {
        int result = Max.toQuals(3, 3);
        assertThat(result, is(3));
    }
}