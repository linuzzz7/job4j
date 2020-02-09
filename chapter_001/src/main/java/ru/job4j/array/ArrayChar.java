package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        int minMass = 0;
        if (word.length > pref.length) {
            minMass = pref.length;
        } else {
            minMass = word.length;
        }
        for (int i = 0; i < minMass; i++) {
            if (word[i] == pref[i]) {
                result = true;
                continue;
            } else {
                result = false;
            }
        }
        return result;
    }
}