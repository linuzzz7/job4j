package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     */
    public boolean exist(double a, double c, double b) {
        boolean result = a + b > c  && a + c > b && b + c > a;
        return result;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     */
    public double area(double a, double b, double c) {
        Triangle tri = new Triangle(first, second, third);
        if (tri.exist(a, b, c)) {
            return TrgArea.area(a, b, c);
        } else {
            return -1;
        }
    }
}