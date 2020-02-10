package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int firstOrSecond = first > second ? first : second;
        int result = firstOrSecond > third ? firstOrSecond : third;
        return result;
    }
}
