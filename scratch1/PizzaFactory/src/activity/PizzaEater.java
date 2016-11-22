package activity;

import creation.Pizzeria;
import creation.impl.NYPizzeria;
import domain.Pizza;

public class PizzaEater {

    public static void main(String[] args) {
        Pizzeria pizzeria = new NYPizzeria();
        Pizza pizza = pizzeria.orderPizza("Cheese");
    }
}
