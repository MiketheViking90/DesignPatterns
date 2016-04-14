package order.impl;

import java.util.ArrayList;

import order.Beverage;
import order.Size;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        this.size = size;
        cost = 2.50;
        description = new ArrayList<>();
        description.add("Espresso");
    }

}
