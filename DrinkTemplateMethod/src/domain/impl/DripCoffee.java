package domain.impl;

import lombok.Getter;

public class DripCoffee {

    @Getter private String name;
    @Getter private double price;

    public DripCoffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, %1.2f", name, price);
    }
}
