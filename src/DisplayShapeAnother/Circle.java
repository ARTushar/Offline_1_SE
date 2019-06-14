package DisplayShapeAnother;

public class Circle extends Shape {
    private double radius;

    public Circle(IngredientFactory factory, double radius) {
        name = "Circle";
        this.ingredientFactory = factory;
        this.radius = radius;
        display();
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
