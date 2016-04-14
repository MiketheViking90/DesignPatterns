package decorator;

import order.Beverage;

public abstract class CondimentDecorator implements Beverage {

    protected Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
