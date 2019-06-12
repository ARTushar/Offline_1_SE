package DisplayShape;

public class CircleA extends Circle {
    private String resolution;

    public CircleA(double radius) {
        super(radius);
        this.resolution = "200*200";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
