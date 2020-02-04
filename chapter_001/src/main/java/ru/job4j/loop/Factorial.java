package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if (n == 0) {
            return 1;
        } else {
            result = n * calc(n - 1);
        }
        return result;
    }
}