package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus is drive");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Количество пассажиров: " + passenger);
    }

    @Override
    public int fillUp(int fuel) {
        return fuel * 50;
    }
}
