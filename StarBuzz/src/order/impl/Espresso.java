package order.impl;

import java.util.ArrayList;
import java.util.List;

import order.Beverage;

public class Espresso implements Beverage {

    @Override
    public double getCost() {
        return 2.50;
    }

    @Override
    public List<String> getCondiments() {
        return new ArrayList<>();
    }
}
