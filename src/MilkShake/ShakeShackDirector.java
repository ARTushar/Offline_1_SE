package MilkShake;

public class ShakeShackDirector {
    private ShakeBuilder builder;


    public ShakeShackDirector(ShakeBuilder builder) {
        this.builder = builder;
    }

    public void constructShake(){
        builder.buildBasicShake();
    }
    public void constructLactoseFreeShake() {
        builder.buildLactoseFreeShake();
    }
    public void addCookie() {
        builder.addCookie();
    }
    public void addCandy(){
        builder.addCandy();
    }
    public Shake getShake(){
        return builder.getShake();
    }
}
