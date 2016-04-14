package order.impl;

import java.util.ArrayList;

import order.Beverage;
import order.Size;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        this.size = size;
        this.cost = 2.00;
        this.description = new ArrayList<>();
        this.description.add("DarkRoast");
    }
}
