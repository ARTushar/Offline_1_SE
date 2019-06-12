package DisplayShape;

public class SquareA extends Square {
    private String resolution;

    public SquareA(double length) {
        super(length);
        this.resolution = "200x200";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
