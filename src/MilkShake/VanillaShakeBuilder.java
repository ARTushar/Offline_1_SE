package MilkShake;

public class VanillaShakeBuilder extends ShakeBuilder {

    @Override
    public void buildBasicShake() {
        shake.addBaseIngredient("milk");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("vanilla flavouring");
        shake.addBaseIngredient("jello");
        shake.increasePrice(Cost.vanillaShake);

    }

    @Override
    public void buildLactoseFreeShake() {
        shake.addBaseIngredient("almond");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("vanilla flavouring");
        shake.addBaseIngredient("jello");
        shake.increasePrice(Cost.vanillaShake);
        shake.increasePrice(Cost.lactoseFree);
        shake.addComment("Extra "+ Cost.lactoseFree +" taka has been added for lactose-free\n");
    }
}
