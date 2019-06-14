package DisplayShapeAnother;

public class IngredientFactoryB implements IngredientFactory {
    @Override
    public CPU getCPU() {
        return new CPUB();
    }

    @Override
    public MMU getMMU() {
        return new MMUB();
    }

    @Override
    public String getResolution() {
        return "350x250";
    }
}
