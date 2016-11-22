package decorator;

import order.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected String name;
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();

        this.cost = beverage.getCost();
        this.description = beverage.getDescription();
    }
}
