package DisplayShape;

public class CircleC extends Circle {
    private String resolution;

    public CircleC(double radius) {
        super(radius);
        this.resolution = "550*430";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
