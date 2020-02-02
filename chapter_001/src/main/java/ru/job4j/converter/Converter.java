package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        boolean rtePassed = euro == 2;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + rtePassed);
        int dollar = rubleToDollar(120);
        boolean rtdPassed = dollar == 2;
        System.out.println("120 rubles are " + dollar + " dollar. Test result: " + rtdPassed);
        int ruble1 = euroToRuble(20);
        boolean etr1Passed = ruble1 == 1400;
        System.out.println("20 euro are " + ruble1 + " ruble. Test result: " + etr1Passed);
        int ruble2 = dollarToRuble(100);
        boolean etr2Passed = ruble2 == 6000;
        System.out.println("100 dollar are " + ruble2 + " ruble. Test result: " + etr2Passed);
    }
}
