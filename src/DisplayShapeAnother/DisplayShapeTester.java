package DisplayShapeAnother;

public class DisplayShapeTester {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory("ComputerB");
        if(factory == null) return;
        assert factory != null;

        Shape test = factory.getShape("circle", 3.0, -5.8);
        if(test == null) return;
        assert test != null;
        test.print();

        test = factory.getShape("rectangle", 2.0, 3.0);
        if(test == null) return;
        assert test != null;
        test.print();

        test = factory.getShape("square", 400);
        if(test == null) return;
        assert test != null;
        test.print();

        test = factory.getShape("triangle", 2.0, 3.0, 4.0);
        if(test == null) return;
        assert test != null;
        test.print();
    }
}
