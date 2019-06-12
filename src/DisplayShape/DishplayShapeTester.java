package DisplayShape;

public class DishplayShapeTester {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory("ComputerA");

        Shape test = factory.getShape("circle", 3.0);
        test.print();

        test = factory.getShape("rectangle", 2.0, 3.0);
        test.print();

        test = factory.getShape("square", 4.0);
        test.print();

        test = factory.getShape("triangle", 2.0, 3.0, 4.0);
        test.print();


    }
}
