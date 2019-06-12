package DisplayShape;

import DisplayShape.Shapes.*;

public class AIngredientFactory implements ShapeIngredientFactory {

    @Override
    public Shape getCircle(double radius) {
        return new CircleA(radius);
    }

    @Override
    public Shape getRectangle(double length, double width) {
        return new RectangleA(length, width);
    }

    @Override
    public Shape getSquare(double length) {
        return new SquareA(length);
    }

    @Override
    public Shape getTriangle(double a, double b, double c) {
        return new TriangleA(a, b, c);
    }
}
