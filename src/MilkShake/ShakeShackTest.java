package MilkShake;

import java.util.ArrayList;
import java.util.Scanner;

public class ShakeShackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ShakeShack!\n");
        String choice;
        boolean isLactosefree;
        boolean hasCandy;
        boolean hasCookie;
        boolean ordered;
        ArrayList<Shake> orderedShakes;
        Shake shake;
        ShakeShack shack = new ShakeShack();
        String c = "O";
        while (!c.equalsIgnoreCase("c")) {
            orderedShakes = new ArrayList<>();
            ordered = false;
            System.out.println("For opening an order type O/o");
            System.out.println("For closing the ShakeShack type C/c");
            c = scanner.next();
            while (c.equalsIgnoreCase("o")) {
                isLactosefree = false;
                hasCandy = false;
                hasCookie = false;
                System.out.println("Please order your desired Milkshakes!\n");
                System.out.println("1. Chocolate Shake");
                System.out.println("2. Coffee Shake");
                System.out.println("3. Strawberry Shake");
                System.out.println("4. Vanilla Shake");
                System.out.println("5. Zero Shake");
                System.out.println("E/e. Close Order");
                choice = scanner.next();
                if(choice.equalsIgnoreCase("o")) {
                    System.out.println("You cannot open another order without completing this order :(");
                    continue;
                }
                if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")) {
                    System.out.println("Do you want Lactose-free shake? Type y/n");
                    if (scanner.next().equalsIgnoreCase("y"))
                        isLactosefree = true;
                    System.out.println("Do you want to add candy? Type y/n");
                    if (scanner.next().equalsIgnoreCase("y"))
                        hasCandy = true;
                    System.out.println("Do you want to add cookie? Type y/n");
                    if (scanner.next().equalsIgnoreCase("y"))
                        hasCookie = true;
                    shake = shack.produceShake(Integer.parseInt(choice), isLactosefree, hasCandy, hasCookie);
                    System.out.println("Continue your ordering");
                    orderedShakes.add(shake);
                    ordered = true;
                } else if (choice.equalsIgnoreCase("e")) {
                    if (ordered) {
                        System.out.println("Thanks for being with us! :D\n");
                        shack.printOrder(orderedShakes);
                        break;
                    } else {
                        System.out.println("Please order at least one item :)");
                    }
                } else {
                    System.out.println("Please input correct number :)");
                }
            }
        }
    }


}
