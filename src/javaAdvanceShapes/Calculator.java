package javaAdvanceShapes;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Shape[] shapes = new Shape[20];


        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShape();

        }
        try {
            for (Shape shape : shapes) {
                System.out.println(shape.getArea());
            }
        } catch (NullPointerException e) {
            System.out.println("Jakis null");
        }
    }


    private static Shape getRandomShape() {
        Random random = new Random();
        Shape result = null;
        switch (random.nextInt(4)) {
            case 0:

                while (result == null){
                    try {
                        result = new Triangle(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble());

                    } catch (IllegalArgumentException e) {
                        System.out.println("Uwaga!" + e.getMessage());
                    } finally {
                        System.out.println("Następny trójkąt");
                    }
                }
                break;
            case 1:
                result = new Rectangle(random.nextDouble(), random.nextDouble());

                break;
            case 2:
                result = new Square(random.nextDouble());
                break;
            case 3:
                while (result == null) {
                    try {
                        System.out.println("Wprowadz liczbę");
                        Scanner scanner = new Scanner(System.in);
                        String s = scanner.next();
                        System.out.println("wczytałem :" + s);
                       result = new Circle(Double.parseDouble(s));

                    } catch ( IllegalArgumentException e) {
                        System.out.println("Błąd! Litera lub wartość ujemna");
                    }
                }
               break;
        }
        return result;
    }

}
