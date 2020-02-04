package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int FirstOrSecond = first > second ? first : second;
        int result = FirstOrSecond > third ? FirstOrSecond : third;
        return result;
    }
}
