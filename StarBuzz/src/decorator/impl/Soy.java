package decorator.impl;

import java.util.List;

import decorator.CondimentDecorator;
import order.Beverage;

public class Soy extends CondimentDecorator {

    private static final double COST_OF_SOY = 0.5;

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + COST_OF_SOY;
    }

    @Override
    public List<String> getCondiments() {
        List<String> condiments = beverage.getCondiments();
        condiments.add("Soy");

        return condiments;
    }

}
