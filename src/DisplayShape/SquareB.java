package DisplayShape;

public class SquareB extends Square {
    private String resolution;

    public SquareB(double length) {
        super(length);
        this.resolution = "350x250";
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
