package javaAdvanceShapes;

public class Circle extends Shape {
    public static final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Radius" + radius);
    }

    @Override
    public double getArea() {
        if (radius < 0) {
            throw new IllegalArgumentException("Minusowa wartosć");
        } else {
            return pi * Math.pow(radius, 2);
        }
    }

    @Override
    public double getPerimeter() {
        if (radius > 0) {
            return radius * 2 * pi;
        } else {
            throw new IllegalArgumentException("Minusowa wartosć");
        }
    }
}
