package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Elena";
        names[1] = "Dima";
        names[2] = "Alex";
        names[3] = "Victor";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}