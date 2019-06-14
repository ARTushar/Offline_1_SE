package MilkShake;

public class ZeroShakeBuilder extends ShakeBuilder {

    @Override
    public void buildBasicShake() {
        shake.addBaseIngredient("milk");
        shake.addBaseIngredient("sweetener");
        shake.addBaseIngredient("vanilla flavouring");
        shake.addBaseIngredient("sugar free jello");
        shake.increasePrice(Cost.zeroShake);

    }

    @Override
    public void buildLactoseFreeShake() {
        shake.addBaseIngredient("almond");
        shake.addBaseIngredient("sweetener");
        shake.addBaseIngredient("vanilla flavouring");
        shake.addBaseIngredient("sugar free jello");
        shake.increasePrice(Cost.zeroShake);
        shake.increasePrice(Cost.lactoseFree);
        shake.addComment("Extra "+ Cost.lactoseFree +" taka has been added for lactose-free\n");
    }
}
