package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int expected = 30;
        int out = Counter.sumByEven(1, 10);
        assertThat(out, is(expected));
    }

    @Test
    public void v2() {
        int expected = 20;
        int out = Counter.sumByEven(2, 8);
        assertThat(out, is(expected));
    }
}