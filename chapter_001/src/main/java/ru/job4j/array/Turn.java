package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

        for (int i = array.length-1, j = 0; i >= array.length/2; i--, j++) {
            int temp;
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        return array;
    }
}