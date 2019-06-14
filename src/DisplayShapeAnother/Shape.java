package DisplayShapeAnother;

public abstract class Shape {
    protected String name;
    protected IngredientFactory ingredientFactory;

    public String getName() {
        return name;
    }

    public String getResolution(){
        return ingredientFactory.getResolution();
    }

    public CPU getCPU(){
        return ingredientFactory.getCPU();
    }

    public MMU getMMU(){
        return ingredientFactory.getMMU();
    }

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