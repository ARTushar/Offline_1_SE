package DisplayShape;

public class CIngredientFactory implements ShapeIngredientFactory {
    @Override
    public Shape getCircle(double radius) {
        return new CircleC(radius);
    }

    @Override
    public Shape getRectangle(double length, double width) {
        return new RectangleC(length, width);
    }

    @Override
    public Shape getSquare(double length) {
        return new SquareC(length);
    }

    @Override
    public Shape getTriangle(double a, double b, double c) {
        return new TriangleC(a, b, c);
    }
}
