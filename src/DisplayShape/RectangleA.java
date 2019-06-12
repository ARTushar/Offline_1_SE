package DisplayShape;

public class RectangleA extends Rectangle {
    private String resolution;

    public RectangleA(double length, double width) {
        super(length, width);
        this.resolution = "200*200";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
