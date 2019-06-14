package DisplayShape;

import DisplayShape.Shapes.Shape;

public class DisplayShapeTester {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory("ComputerC");
        assert factory != null;

        Shape test = factory.getShape("circle", 3.0, 5.8);
        assert test != null;
        test.print();

        test = factory.getShape("rectangle", 2.0, 3.0);
        assert test != null;
        test.print();

        test = factory.getShape("square", 400);
        assert test != null;
        test.print();

        test = factory.getShape("triangle", 2.0, 3.0, 4.0);
        assert test != null;
        test.print();
    }
}
