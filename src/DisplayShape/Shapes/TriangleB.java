package DisplayShape.Shapes;

public class TriangleB extends Trangle {
    private String resolution;

    public TriangleB(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        this.resolution = "350x250";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
