package DisplayShape;

public class CircleA extends Circle {
    private String resoulution;

    public CircleA(double radius) {
        super(radius);
        this.resoulution = "200*200";
    }

    @Override
    public String getResolution() {
        return resoulution;
    }
}
