package DisplayShape.Shapes;

public class SquareC extends Square {
    private String resoulution;

    public SquareC(double length) {
        super(length);
        this.resoulution = "550x430";
    }

    @Override
    public String getResolution() {
        return resoulution;
    }
}
