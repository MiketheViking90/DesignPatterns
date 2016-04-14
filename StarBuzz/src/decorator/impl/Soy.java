package decorator.impl;

import java.util.List;

import decorator.CondimentDecorator;
import order.Beverage;
import order.Size;

public class Soy extends CondimentDecorator {

    private static final double COST_OF_SOY = 0.5;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public double getCost() {
        Size size = beverage.getSize();
        double addedPrice = size.getMultiplier() * COST_OF_SOY;
        return beverage.getCost() + addedPrice;
    }

    @Override
    public List<String> getDescription() {
        List<String> condiments = beverage.getDescription();
        condiments.add("Soy");

        return condiments;
    }

}
