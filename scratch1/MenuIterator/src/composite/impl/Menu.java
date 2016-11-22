package composite.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import composite.MenuComponent;
import lombok.Getter;

public class Menu implements MenuComponent {

    private static final String DISPLAY_FORMAT = "\n%s, %s------------";

    List<MenuComponent> components = new ArrayList<>();
    @Getter private String name;
    @Getter private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public String toString() {
        String titleString = String.format(DISPLAY_FORMAT, name, description);
        StringBuilder displayString = new StringBuilder(titleString);

        Iterator<MenuComponent> menuIterator = components.iterator();
        while(menuIterator.hasNext()) {
            MenuComponent component = menuIterator.next();
            displayString.append(component.toString());
        }

        return displayString.toString();
    }

}
