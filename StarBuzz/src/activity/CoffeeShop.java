package activity;

import decorator.impl.Mocha;
import decorator.impl.Soy;
import order.Beverage;
import order.Size;
import order.impl.DarkRoast;

public class CoffeeShop {

    public static void main(String[] args) {
        Beverage drink = new DarkRoast(Size.TALL);
        System.out.println(drink.getCost());
        drink = new Soy(drink);
        System.out.println(drink.getCost());
        drink = new Mocha(drink);
        System.out.println(drink.getCost());
    }
}
