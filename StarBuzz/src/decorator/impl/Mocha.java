package decorator.impl;

import java.util.List;

import decorator.CondimentDecorator;
import order.Beverage;
import order.Size;

public class Mocha extends CondimentDecorator {

    private static final double COST_OF_MOCHA = 0.85;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public double getCost() {
        Size size = beverage.getSize();
        double addedPrice = size.getMultiplier() * COST_OF_MOCHA;
        return beverage.getCost() + addedPrice;
    }

    @Override
    public List<String> getDescription() {
        List<String> condiments = beverage.getDescription();
        condiments.add("Mocha");

        return condiments;
    }

}
