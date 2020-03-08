package javaAdvanceShapes;

public class Square extends Rectangle {


    public Square(double edgeA) {
        super(edgeA, edgeA);
        // a to dziwne, bo dziedziczymy z prostokata a tam bylo trzeba podac dwa parametry
    }

    @Override
    public double getArea() {
        return super.edgeA*2;
    }


    @Override
    public double getPerimeter() {
        return super.edgeA*4;
    }
}


