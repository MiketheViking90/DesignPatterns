package client;

import java.util.Arrays;

import domain.impl.CoffeeNameComparator;
import domain.impl.CoffeePriceComparator;
import domain.impl.DripCoffee;

public class ComparatorClient {

    public static void main(String[] args) {
        DripCoffee dc1 = new DripCoffee("Jim", 1);
        DripCoffee dc2 = new DripCoffee("Abel", 5);
        DripCoffee dc3 = new DripCoffee("Cain", 10);
        DripCoffee dc4 = new DripCoffee("Bill", 1.4);
        DripCoffee dc5 = new DripCoffee("Paul", 3.5);

        CoffeePriceComparator priceComp = new CoffeePriceComparator();
        CoffeeNameComparator nameComp = new CoffeeNameComparator();

        DripCoffee[] coffees = {dc1, dc2, dc3, dc4, dc5};
        System.out.println(Arrays.toString(coffees));

        Arrays.sort(coffees, priceComp);
        System.out.println(Arrays.toString(coffees));


        Arrays.sort(coffees, nameComp);
        System.out.println(Arrays.toString(coffees));
    }
}
