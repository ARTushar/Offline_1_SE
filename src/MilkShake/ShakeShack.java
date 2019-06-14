package MilkShake;

import MilkShake.Shake;
import MilkShake.ShakeShackDirector;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;

public class ShakeShack {

    public Shake produceShake(int type, boolean isLactoseFree, boolean hasCandy, boolean hasCookie) {
        Shake shake = null;
        ShakeShackDirector shakeCreator = null;

        if (type == 1) {
            shakeCreator = new ShakeShackDirector(new ChocolateShakeBuilder());
            shakeCreator.getShake().setName("Chocolate Shake");
        } else if (type == 2) {
            shakeCreator = new ShakeShackDirector(new CoffeeShakeBuilder());
            shakeCreator.getShake().setName("Coffee Shake");
        } else if (type == 3) {
            shakeCreator = new ShakeShackDirector(new StrawberryShakeBuilder());
            shakeCreator.getShake().setName("Strawberry Shake");
        } else if (type == 4) {
            shakeCreator = new ShakeShackDirector(new VanillaShakeBuilder());
            shakeCreator.getShake().setName("Vanilla Shake");
        } else if (type == 5) {
            shakeCreator = new ShakeShackDirector(new ZeroShakeBuilder());
            shakeCreator.getShake().setName("Zero Shake");
        } else return null;

        if (isLactoseFree) {
            shakeCreator.constructLactoseFreeShake();
        } else {
            shakeCreator.constructShake();
        }
        if (hasCandy) {
            shakeCreator.addCandy();
        }
        if (hasCookie) {
            shakeCreator.addCookie();
        }
        shake = shakeCreator.getShake();
        return shake;
    }
    public void printOrder(ArrayList<Shake> list) {
        Iterator<Shake> iterator = list.iterator();
        Shake shake;
        int i = 1;
        double totalCost = 0;
        while (iterator.hasNext()) {
            shake = iterator.next();
            totalCost += shake.getPrice();
            System.out.println("Item #" + i + ": ");
            System.out.println("Name : "+ shake.getName());
            System.out.print("Basic Ingredients : ");

            ArrayList<String> basic = shake.getBaseIngredients();

            for(int j = 0; j < basic.size(); j++){
                System.out.print(basic.get(j));
                if(j != basic.size()-1) System.out.print(", ");
            }
            System.out.println();

            ArrayList<String> added = shake.getExtraIngredients();

            if(added.size() != 0){
                System.out.print("Added Ingredients: ");
                for(int j = 0; j < added.size(); j++) {
                    System.out.print(added.get(j));
                    if(j != added.size()-1) System.out.print(", ");
                }
                System.out.println();
            }
            System.out.println("Cost: Tk " + shake.getPrice() + "\n");

            if(shake.getComment().length() != 0) {
                System.out.print("N.B : ");
                System.out.println(shake.getComment());
            }
            System.out.println();
            i++;
        }
        System.out.println("Total Cost: Tk " + totalCost);
        System.out.println("\nThanks for being with us!\n");
    }
}
