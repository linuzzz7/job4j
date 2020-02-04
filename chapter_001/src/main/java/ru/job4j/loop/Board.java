package ru.job4j.loop;

public class Board {
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }

    public static void paint(int width, int height) {
        for (int i = 1; i <= width; i++) {
            if (i % 2 == 0) {
                for (int y = 0; y < height; y++) {
                    // условие проверки, что писать пробел или X
                    // Выше в задании мы определили закономерность, когда нужно проставлять X
                    if (y % 2 != 0) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int y = 0; y < height; y++) {
                    // условие проверки, что писать пробел или X
                    // Выше в задании мы определили закономерность, когда нужно проставлять X
                    if (y % 2 == 0) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }
}