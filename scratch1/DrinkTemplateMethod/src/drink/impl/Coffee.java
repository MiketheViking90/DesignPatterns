package drink.impl;

import java.util.Scanner;

public class Coffee extends Drink {

    @Override
    protected void prepareDrink() {
        System.out.println("Steeping tea bag");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String customerResponse = getUserInput();

        if (customerResponse.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        System.out.print("Want lemon with your tea (y/n)?");

        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        in.close();
        return response;
    }
}
