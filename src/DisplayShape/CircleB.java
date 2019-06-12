package DisplayShape;

public class CircleB extends Circle {
    private String resoulution;

    public CircleB(double radius) {
        super(radius);
        this.resoulution = "350*250";
    }

    @Override
    public String getResolution() {
        return resoulution;
    }
}
