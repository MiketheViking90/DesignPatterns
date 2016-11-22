package domain.impl;

import java.util.Comparator;

public class CoffeePriceComparator implements Comparator<DripCoffee> {

    @Override
    public int compare(DripCoffee o1, DripCoffee o2) {
        double p1 = o1.getPrice();
        double p2 = o2.getPrice();

        if (p1 > p2) {
            return 1;
        } else if (p1 < p2) {
            return -1;
        } else {
            return 0;
        }
    }

}
