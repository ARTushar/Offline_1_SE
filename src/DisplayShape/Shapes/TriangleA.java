package DisplayShape.Shapes;

public class TriangleA extends Triangle {
    private String resolution;

    public TriangleA(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        this.resolution = "200x200";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
