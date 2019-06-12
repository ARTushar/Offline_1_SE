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
        else if(shapeType.equals("circle"))
            return ingredientFactory.getCircle(a[0]);
        else if(shapeType.equals("rectangle"))
            return ingredientFactory.getRectangle(a[0], a[1]);
        else if(shapeType.equals("square"))
            return ingredientFactory.getSquare(a[0]);
        else if (shapeType.equals("triangle"))
            return ingredientFactory.getTriangle(a[0], a[1], a[2]);
        else
            return null;

    }
}
