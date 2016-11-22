package domain.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Pizza;
import domain.Toppings;

public class StandardPizza implements Pizza {

    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public List<Toppings> getToppings() {
        return new ArrayList<>();
    }
}
