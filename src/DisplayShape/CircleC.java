package DisplayShape;

public class CircleC extends Circle {
    private String resoulution;

    public CircleC(double radius) {
        super(radius);
        this.resoulution = "550*430";
    }

    @Override
    public String getResolution() {
        return resoulution;
    }
}
