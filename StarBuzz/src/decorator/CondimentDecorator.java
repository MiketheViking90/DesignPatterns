package decorator;

import java.util.List;

import order.Beverage;
import order.Size;

public abstract class CondimentDecorator extends Beverage {

    protected double cost;
    protected String name;
    protected Beverage beverage;

    @Override
    public double getCost() {
        Size size = beverage.getSize();
        double addedPrice = size.getMultiplier() * cost;
        return beverage.getCost() + addedPrice;
    }

    @Override
    public List<String> getDescription() {
        List<String> condiments = beverage.getDescription();
        condiments.add(name);

        return condiments;
    }
}
