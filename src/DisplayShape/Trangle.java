package DisplayShape;

public abstract class Trangle extends Shape {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;

    public Trangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = "Triangle";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Displaying Triangle");
    }


    @Override
    public double surfaceArea() {
        double s = perimeter() / 2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
