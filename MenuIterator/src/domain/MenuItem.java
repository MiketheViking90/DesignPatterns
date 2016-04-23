package domain;

import lombok.Getter;

@Getter
public class MenuItem {

    private static final String DISPLAY_FORMAT = "%s (%1.2f): \n %s";

    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;


    public MenuItem(String name,
            String description,
            boolean isVegetarian,
            double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(DISPLAY_FORMAT, name, price, description);
    }
}
