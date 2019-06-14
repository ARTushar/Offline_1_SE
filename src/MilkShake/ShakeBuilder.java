package MilkShake;

public abstract class ShakeBuilder {
    protected Shake shake;
    private boolean isCandyAdded = false;
    private boolean isCookieAdded = false;

    public ShakeBuilder() {
        shake = new Shake();
    }

    public abstract void buildBasicShake();

    public abstract void buildLactoseFreeShake();

    public void addCandy() {
        if(isCandyAdded) return;
        shake.addExtra("candy");
        shake.increasePrice(Cost.candy);
        shake.addComment("Extra "+ Cost.candy +" taka has been added for candy\n");
        isCandyAdded = true;
    }

    public void addCookie() {
        if(isCookieAdded) return;
        shake.addExtra("cookie");
        shake.increasePrice(Cost.cookie);
        shake.addComment("Extra "+ Cost.cookie +" taka has been added for cookie\n");
        isCookieAdded = true;

    }
    public Shake getShake() {
        return shake;
    }
}
