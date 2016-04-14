package order.impl;

import java.util.ArrayList;
import java.util.List;

import order.Beverage;

public class DarkRoast implements Beverage {

    @Override
    public double getCost() {
        return 2.00;
    }

    @Override
    public List<String> getCondiments() {
        return new ArrayList<>();
    }
}
