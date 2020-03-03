package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book muggle = new Book();
        muggle.setName("Muugle");
        muggle.setSum(130);
        Book cinderella = new Book();
        cinderella.setName("Cinderella");
        cinderella.setSum(150);
        Book spider = new Book();
        spider.setName("Clean code");
        spider.setSum(200);
        Book cat = new Book();
        cat.setName("Black cat");
        cat.setSum(222);
        Book[] lib = new Book[4];
        lib[0] = muggle;
        lib[1] = cinderella;
        lib[2] = spider;
        lib[3] = cat;
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " " + lib[i].getSum());
        }

        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;
        System.out.println();
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " " + lib[i].getSum());
        }

        for (int i = 0; i < lib.length; i++) {
            if (lib[i].getName().equals("Clean code")) {
                System.out.println("\n" + lib[i].getName() + " " + lib[i].getSum());
            }
        }
    }
}
