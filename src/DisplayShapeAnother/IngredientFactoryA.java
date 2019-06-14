package DisplayShapeAnother;

public class IngredientFactoryA implements IngredientFactory {
    @Override
    public CPU getCPU() {
        return new CPUA();
    }

    @Override
    public MMU getMMU() {
        return new MMUA();
    }

    @Override
    public String getResolution() {
        return "200x200";
    }
}
