package MilkShake;

public class CoffeeShakeBuilder extends ShakeBuilder {

    @Override
    public void buildBasicShake() {
        shake.addBaseIngredient("milk");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("coffee");
        shake.addBaseIngredient("jello");
        shake.increasePrice(Cost.coffeeShake);

    }

    @Override
    public void buildLactoseFreeShake() {
        shake.addBaseIngredient("almond");
        shake.addBaseIngredient("sugar");
        shake.addBaseIngredient("coffee");
        shake.addBaseIngredient("jello");
        shake.increasePrice(Cost.coffeeShake);
        shake.increasePrice(Cost.lactoseFree);
        shake.addComment("Extra "+ Cost.lactoseFree +" taka has been added for lactose-free\n");
    }
}
