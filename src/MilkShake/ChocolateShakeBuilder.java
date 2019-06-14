package MilkShake;

public class ChocolateShakeBuilder extends ShakeBuilder {

    @Override
    public void buildBasicShake() {
        shake.addBaseIngredient("milk");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("chocolate syrup");
        shake.addBaseIngredient("chocolate icecream");
        shake.increasePrice(Cost.chocolateShake);

    }

    @Override
    public void buildLactoseFreeShake() {
        shake.addBaseIngredient("almond");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("chocolate syrup");
        shake.addBaseIngredient("chocolate icecream");
        shake.increasePrice(Cost.chocolateShake);
        shake.increasePrice(Cost.lactoseFree);
        shake.addComment("Extra "+ Cost.lactoseFree +" taka has been added for lactose-free\n");
    }
}
