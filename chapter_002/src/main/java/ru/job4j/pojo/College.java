package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Dmitriy Alexandrovich Petrov");
        student.setGroup(10);
        student.setDate("2020.01.09");
        System.out.println(student.getFio() + " Group: " + student.getGroup() + " Date: " + student.getDate());
    }
}
