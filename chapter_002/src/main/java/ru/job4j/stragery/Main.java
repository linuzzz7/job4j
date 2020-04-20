package ru.job4j.stragery;

public class Main {
    public static void main(String[] args) {
        Triangle testTriangle = new Triangle();
        Square testSquare = new Square();
        Paint print = new Paint();
        print.draw(testTriangle);
        print.draw(testSquare);
    }
}
