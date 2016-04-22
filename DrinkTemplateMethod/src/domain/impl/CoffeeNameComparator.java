package domain.impl;

import java.util.Comparator;

public class CoffeeNameComparator implements Comparator<DripCoffee> {

    @Override
    public int compare(DripCoffee o1, DripCoffee o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
