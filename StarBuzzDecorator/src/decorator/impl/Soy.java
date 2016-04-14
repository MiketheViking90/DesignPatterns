package decorator.impl;

import decorator.CondimentDecorator;
import order.Beverage;

public class Soy extends CondimentDecorator {

    private static final double COST_OF_SOY = 0.5;

    public Soy(Beverage beverage) {
        super(beverage);
        this.name = "Soy";

        this.cost = beverage.getCost() + COST_OF_SOY;
        description.add(name);
    }

}
