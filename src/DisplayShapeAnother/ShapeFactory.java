package DisplayShapeAnother;


public class ShapeFactory {
    private IngredientFactory ingredientFactory;

    public ShapeFactory(String computerType) {
        if(computerType.equals("ComputerA"))
            ingredientFactory = new IngredientFactoryA();
        else if(computerType.equals("ComputerB"))
            ingredientFactory = new IngredientFactoryB();
        else if (computerType.equals("ComputerC"))
            ingredientFactory = new IngredientFactoryC();
        else {
            System.out.println("Unknown Computer Type");
        }
    }

    public Shape getShape(String shapeType, double ...a) {
        if(shapeType == null)
            return null;
        else if(shapeType.equals("circle")) {
            assert a.length == 1;
            if(a.length != 1 || a[0] <= 0.0) {
                System.out.println("Invalid parameters (circle)");
                return null;
            }
            return new Circle(ingredientFactory, a[0]);
        }
        else if(shapeType.equals("rectangle")) {
            assert a.length == 2;
            if(a.length != 2 || a[0] <= 0.0 || a[1] <= 0) {
                System.out.println("Invalid parameters (rectangle)");
                return null;
            }
            return new Rectangle(ingredientFactory, a[0], a[1]) {
            };
        }
        else if(shapeType.equals("square")) {
            assert a.length == 1;
            if(a.length != 1 || a[0] <= 0.0) {
                System.out.println("Invalid parameters (square)");
                return null;
            }
            return new Square(ingredientFactory, a[0]);
        }
        else if (shapeType.equals("triangle")) {
            assert a.length == 3;
            if(a.length != 3 || a[0] <= 0.0 || a[1] <= 0 || a[2] <= 0) {
                System.out.println("Invalid parameters (triangle)");
                return null;
            }
            return new Triangle(ingredientFactory,a[0], a[1], a[2]);
        }
        else
            return null;

    }
}
