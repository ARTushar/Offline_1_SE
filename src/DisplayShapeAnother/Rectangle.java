package DisplayShapeAnother;

public class Rectangle extends Shape {
    private String name;
    private double length;
    private  double width;

    public Rectangle(IngredientFactory factory, double length, double width) {
        this.ingredientFactory = factory;
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
        display();

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Displaying Rectangle");
    }


    @Override
    public double surfaceArea() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2*length + 2*width;
    }
}
