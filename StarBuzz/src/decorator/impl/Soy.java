package decorator.impl;

import decorator.CondimentDecorator;
import order.Beverage;

public class Soy extends CondimentDecorator {

    private static final double COST_OF_SOY = 0.5;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();

        this.cost = COST_OF_SOY;
        this.name = "Soy";
    }

}
