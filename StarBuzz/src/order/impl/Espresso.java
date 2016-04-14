package order.impl;

import java.util.ArrayList;

import order.Beverage;
import order.Size;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        this.size = size;
        this.cost = 2.50;
        this.description = new ArrayList<>();
        this.description.add("Espresso");
    }

}
