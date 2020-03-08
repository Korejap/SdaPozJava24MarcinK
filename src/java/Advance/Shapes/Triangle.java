package java.Advance.Shapes;

public class Triangle extends Polygon {

    private double edgeA;
    private double edgeB;
    private double edgeC;
  private   double height;

    public Triangle(double edgeA, double edgeB, double edgeC, double height) {
        super(3);
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        this.height = height;

    }


    @Override
    public double getArea() {
        return (0.5 * edgeA * height);
    }

    @Override
    public double getPerimeter() {
        return edgeA+edgeB+edgeC;
    }
}
