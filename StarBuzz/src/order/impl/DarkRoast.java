package order.impl;

import java.util.ArrayList;

import order.Beverage;
import order.Size;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        this.size = size;
        cost = 2.00;
        description = new ArrayList<>();
        description.add("DarkRoast");
    }
}
