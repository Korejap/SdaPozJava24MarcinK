package java.Advance.Shapes;

public class Circle extends Shape {
public static final double pi = 3.14;
private final double radius;
public Circle (double radius){
    this.radius = radius;
}

    @Override
    public double getArea() {
        return pi*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return radius*2*pi;
    }
}
