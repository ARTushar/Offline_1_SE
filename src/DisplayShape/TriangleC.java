package DisplayShape;

public class TriangleC extends Trangle{
    private String resolution;

    public TriangleC(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        this.resolution = "550x430";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
