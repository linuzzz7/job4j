package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] mass = new int[3][3];
        int massIndex = 1;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = massIndex;
                massIndex++;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
