package DisplayShape;

public interface ShapeIngredientFactory {
    Shape getCircle(double radius);
    Shape getRectangle(double length, double width);
    Shape getSquare(double length);
    Shape getTriangle(double a, double b, double c);
}
