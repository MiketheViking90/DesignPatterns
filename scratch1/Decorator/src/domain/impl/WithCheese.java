package domain.impl;

import java.util.List;

import domain.Pizza;
import domain.PizzaDecorator;
import domain.Toppings;

public class WithCheese extends PizzaDecorator {

    private static final double COST_OF_CHEESE = 0.5;

    public WithCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST_OF_CHEESE;
    }

    @Override
    public List<Toppings> getToppings() {
        List<Toppings> toppings = super.getToppings();
        toppings.add(Toppings.CHEESE);
        return toppings;
    }
}
