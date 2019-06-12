package DisplayShape;

public abstract class Shape {

    public abstract String getName();

    public abstract String getResolution();

    public abstract void display();

    public abstract double surfaceArea();

    public abstract double perimeter();

    public void print(){
        System.out.println("Name : " + getName());
        System.out.println("Resolution : " + getResolution());
        System.out.println("Surface Area : " + surfaceArea() + " unit sq");
        System.out.println("Perimeter : " + perimeter() + " unit");
        System.out.println();
    }
}

