package DisplayShape;

import javax.sound.midi.Soundbank;

public class ShapeFactory {
    private ShapeIngredientFactory ingredientFactory;

    public ShapeFactory(String computerType) {
        if(computerType.equals("ComputerA"))
            ingredientFactory = new AIngredientFactory();
        else if(computerType.equals("ComputerB"))
            ingredientFactory = new BIngredientFactory();
        else if (computerType.equals("ComputerC"))
            ingredientFactory = new CIngredientFactory();
        else
            System.out.println("Unknown Computer Type");
    }

    public  Shape getShape(String shapeType, double ...a) {
        if(shapeType == null)
            return null;
        else if(shapeType.equals("circle")) {
            assert a.length == 1;
            return ingredientFactory.getCircle(a[0]);
        }
        else if(shapeType.equals("rectangle")) {
            assert a.length == 2;
            return ingredientFactory.getRectangle(a[0], a[1]);
        }
        else if(shapeType.equals("square")) {
            assert a.length == 1;
            return ingredientFactory.getSquare(a[0]);
        }
        else if (shapeType.equals("triangle")) {
            assert a.length == 3;
            return ingredientFactory.getTriangle(a[0], a[1], a[2]);
        }
        else
            return null;

    }
}
