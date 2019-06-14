package MilkShake;

public class StrawberryShakeBuilder extends ShakeBuilder {

    @Override
    public void buildBasicShake() {
        shake.addBaseIngredient("milk");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("strawberry syrup");
        shake.addBaseIngredient("strawberry icecream");
        shake.increasePrice(Cost.strawberryShake);

    }

    @Override
    public void buildLactoseFreeShake() {
        shake.addBaseIngredient("almond");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("strawberry syrup");
        shake.addBaseIngredient("strawberry icecream");
        shake.increasePrice(Cost.strawberryShake);
        shake.increasePrice(Cost.lactoseFree);
        shake.addComment("Extra "+ Cost.lactoseFree +" taka has been added for lactose-free\n");
    }
}
