package domain.impl;

import java.util.List;

import domain.Pizza;
import domain.Toppings;

public class Pizzeria {

    private Pizza pizza;

    public Pizza makePizza(List<Toppings> toppings) {
        pizza = new StandardPizza();

        for (Toppings topping : toppings) {
            pizza = decoratePizza(topping);
        }

        return pizza;
    }

    public Pizza makePizza(Toppings topping, Pizza pizza) {
        this.pizza = pizza;
        return decoratePizza(topping);

    }

    private Pizza decoratePizza(Toppings topping) {
        switch (topping) {
            case CHEESE :
                System.out.println("Adding cheese");
                return new WithCheese(pizza);
            case PEPPERONI :
                System.out.println("Adding pepperoni");
                return new WithPepperoni(pizza);
            default :
                return null;
        }
    }
}
