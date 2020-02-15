package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexL = 0;
        int indexR = 0;
        int indexMerge = 0;
        while (indexMerge <= rsl.length - 1) {
            if (left.length + right.length == 0) {
                break;
            } else if (left.length == 0 && right.length != 0) {
                rsl = right;
                break;
            } else if (right.length == 0 && left.length != 0) {
                rsl = left;
                break;
            }

            if (indexL <= left.length - 1 && left[indexL] <= right[indexR]) {
                rsl[indexMerge] = left[indexL];
                indexL++;

            } else if (indexR <= right.length - 1 && right[indexR] <= left[indexL]) {
                rsl[indexMerge] = right[indexR];
                indexR++;
            }
            indexMerge++;

            if (indexR == right.length) {
                for (int i = indexL; indexL < left.length; indexL++, indexMerge++) {
                    rsl[indexMerge] = left[indexL];
                }
                break;
            }
            if (indexL == left.length) {
                for (int i = indexR; indexR < right.length; indexR++, indexMerge++) {
                    rsl[indexMerge] = right[indexR];
                }
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4, 6, 7}
        );
        System.out.println(Arrays.toString(rsl));
    }
}