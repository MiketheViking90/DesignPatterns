package domain.impl;

import java.util.List;

import domain.Pizza;
import domain.PizzaDecorator;
import domain.Toppings;

public class WithPepperoni extends PizzaDecorator {

    public WithPepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }

    @Override
    public List<Toppings> getToppings() {
        List<Toppings> toppings = super.getToppings();
        toppings.add(Toppings.PEPPERONI);
        return toppings;
    }

}
