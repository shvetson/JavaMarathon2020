package day9.Task2;

import day9.Task2.Figure;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}