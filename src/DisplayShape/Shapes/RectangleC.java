package DisplayShape.Shapes;

public class RectangleC extends Rectangle {
    private String resolution;

    public RectangleC(double length, double width) {
        super(length, width);
        this.resolution = "550*430";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
