package client;

import drink.impl.Coffee;
import drink.impl.Drink;
import drink.impl.Tea;

public class CoffeeshopClient {

    public static void main(String[] args) {
        Drink coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();

        Drink tea = new Tea();
        tea.prepareRecipe();
    }
}
