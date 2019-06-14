package DisplayShapeAnother;

public class IngredientFactoryC implements IngredientFactory {
    @Override
    public CPU getCPU() {
        return new CPUC();
    }

    @Override
    public MMU getMMU() {
        return new MMUC();
    }

    @Override
    public String getResolution() {
        return "550x430";
    }
}
