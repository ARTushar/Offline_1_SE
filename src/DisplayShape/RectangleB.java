package DisplayShape;

public class RectangleB extends Rectangle {
    private String resolution;

    public RectangleB(double length, double width) {
        super(length, width);
        this.resolution = "350*250";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
