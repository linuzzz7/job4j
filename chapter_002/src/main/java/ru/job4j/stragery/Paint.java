package ru.job4j.stragery;

public class Paint {

    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }


    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.draw());
        System.out.println(System.lineSeparator());
        Triangle triangle = new Triangle();
        System.out.println(triangle.draw());


    }
}
