package DisplayShape;

import DisplayShape.Shapes.*;

public class BIngredientFactory implements ShapeIngredientFactory {
    @Override
    public Shape getCircle(double radius) {
        return new CircleB(radius);
    }

    @Override
    public Shape getRectangle(double length, double width) {
        return new RectangleB(length, width);
    }

    @Override
    public Shape getSquare(double length) {
        return new SquareB(length);
    }

    @Override
    public Shape getTriangle(double a, double b, double c) {
        return new TriangleB(a, b, c);
    }
}
