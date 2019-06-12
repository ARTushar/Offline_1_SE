package DisplayShape.Shapes;

public class CircleB extends Circle {
    private String resolution;

    public CircleB(double radius) {
        super(radius);
        this.resolution = "350*250";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
