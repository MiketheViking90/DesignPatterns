package activity;

import java.util.ArrayList;
import java.util.List;

import domain.Pizza;
import domain.Toppings;
import domain.impl.Pizzeria;

public class OrderPizza {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        List<Toppings> toppings = new ArrayList<>();
        toppings.add(Toppings.CHEESE);
        toppings.add(Toppings.PEPPERONI);
        toppings.add(Toppings.CHEESE);

        Pizza pizza = pizzeria.makePizza(toppings);
        pizza = pizzeria.makePizza(Toppings.CHEESE, pizza);

        System.out.println(pizza.getCost());
        System.out.println(pizza.getToppings());
    }
}
