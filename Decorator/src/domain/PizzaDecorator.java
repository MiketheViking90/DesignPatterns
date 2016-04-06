package domain;

import java.util.List;

public abstract class PizzaDecorator implements Pizza {

    private final Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        decoratedPizza = pizza;
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }

    @Override
    public List<Toppings> getToppings() {
        return decoratedPizza.getToppings();
    }

}
