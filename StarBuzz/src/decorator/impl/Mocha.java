package decorator.impl;

import decorator.CondimentDecorator;
import order.Beverage;

public class Mocha extends CondimentDecorator {

    private static final double COST_OF_MOCHA = 0.85;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();

        this.cost = COST_OF_MOCHA;
        this.name = "Mocha";
    }

}
