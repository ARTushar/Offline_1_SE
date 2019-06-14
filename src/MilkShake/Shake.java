package MilkShake;

import java.util.ArrayList;

public class Shake {
    private String name;
    private ArrayList<String> baseIngredients;
    private ArrayList<String> extraIngredients;
    private double price;
    private String comment;

    public Shake() {
        baseIngredients = new ArrayList<>();
        extraIngredients = new ArrayList<>();
        price = 0.0;
        comment = "";
    }

    public void addBaseIngredient(String ingredient){
        baseIngredients.add(ingredient);
    }
    public void addExtra(String extra){
        extraIngredients.add(extra);
    }
    public double getPrice(){
        return price;
    }
    public String getComment(){
        return comment;
    }
    void increasePrice(double a){
        this.price += a;
    }
    void addComment(String str){
        this.comment += str;
    }

    public ArrayList<String> getBaseIngredients() {
        return baseIngredients;
    }

    public ArrayList<String> getExtraIngredients() {
        return extraIngredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
