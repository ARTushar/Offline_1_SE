package DisplayShape;

public abstract class Circle extends Shape {
    private String name;
    private double radius;

    public Circle(double radius) {
        name = "Circle";
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Displaying Circle");
    }

    @Override
    public double surfaceArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName(){
        return name;
    }
}
