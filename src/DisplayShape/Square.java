package DisplayShape;

public abstract class Square extends Shape {
    private String name;
    private double length;

    public Square(double length) {
        this.name = "Square";
        this.length = length;
        display();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Displaying square");
    }

    @Override
    public double surfaceArea() {
        return length * length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}
