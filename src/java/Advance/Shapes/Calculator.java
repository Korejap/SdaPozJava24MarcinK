package java.Advance.Shapes;

import java.util.Random;

public class Calculator {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[20];


        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShapes();

        }
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }

    private static Shape getRandomShapes() {
        Random random = new Random();
        Shape result = null;
        switch (random.nextInt(4)) {
            case 0:
                result = new Triangle(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble());
                break;
            case 1:
                result = new Rectangle(random.nextDouble(), random.nextDouble());
                break;
            case 2:
                result = new Circle(random.nextDouble());
                break;
            case 3:
                result = new Square(random.nextDouble());
                break;

        }
        return null;
    }

}
