package decorator.impl;

import java.util.List;

import decorator.CondimentDecorator;
import order.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.75;
    }

    @Override
    public List<String> getCondiments() {
        List<String> condiments = beverage.getCondiments();
        condiments.add("Mocha");

        return condiments;
    }

}
