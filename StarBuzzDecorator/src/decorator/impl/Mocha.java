package decorator.impl;

import decorator.CondimentDecorator;
import order.Beverage;

public class Mocha extends CondimentDecorator {

    private static final double COST_OF_MOCHA = 0.85;

    public Mocha(Beverage beverage) {
        super(beverage);
        this.name = "Mocha";

        this.cost = beverage.getCost() + COST_OF_MOCHA;
        description.add(name);
    }

}
