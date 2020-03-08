package java.Advance.Shapes;

public class Rectangle extends Polygon{

    protected double edgeA;
    protected double edgeB;

    public Rectangle(double edgeA, double edgeB) {
        super(4);
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }


    @Override
    public double getArea() {
        return edgeA*edgeB;
    }

    @Override
    public double getPerimeter() {
        return 2*edgeA+2*edgeB;
    }
}

