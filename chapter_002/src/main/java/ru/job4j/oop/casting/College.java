package ru.job4j.oop.casting;

public class College {
    public static void main(String[] args) {
        Freshman fm = new Freshman();
        Student st = fm;
        Object ob = st;
    }
}
