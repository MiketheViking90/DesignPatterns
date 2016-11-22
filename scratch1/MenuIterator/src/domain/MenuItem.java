package domain;

import composite.MenuComponent;
import lombok.Getter;

@Getter
public class MenuItem implements MenuComponent {

    private static final String DISPLAY_FORMAT = "\n  %s (%1.2f): \n     %s";

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

    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
}
