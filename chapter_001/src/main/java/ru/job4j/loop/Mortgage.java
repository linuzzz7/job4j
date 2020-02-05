package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double sumTemp = amount;
        while (sumTemp > 0) {
            sumTemp = (sumTemp + ((sumTemp / 100) * percent)) - salary;
            year++;
        }
        return year;
    }
}
