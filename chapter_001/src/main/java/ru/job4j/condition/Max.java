package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static boolean maxFirst(int left, int right){
        boolean result = left > right ? true : false;
        return result;
    }

    public static boolean maxSecond(int left, int right){
        boolean result = left < right ? true : false;
        return result;
    }

    public static int toQuals(int left, int right){
        int result = left == right ? left : right;
        return result;
    }
}
