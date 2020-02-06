package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas7Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {10, 56, 7, 10, 3, 21};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayNoHas30Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 7, 8, 2, 3, 21};
        int value = 30;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}