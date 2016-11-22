package collection.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import collection.Menu;
import domain.MenuItem;

public class CafeMenu extends Menu {

    private Map<String, MenuItem> menu;

    public CafeMenu() {
        name = "CafeMenu";
        menu = new HashMap<>();

        MenuItem vegBurger = new MenuItem("Veggie Burger",
                "Veggie burger with lettuce, tomato, and fries.",
                true,
                5.69);

        MenuItem burrito = new MenuItem("Burrito",
                "Burrito with carne asada, guacamole, and salsa.",
                false,
                5.50);

        menu.put(vegBurger.getName(), vegBurger);
        menu.put(burrito.getName(), burrito);

    }

    @Override
    public void addItem(MenuItem item) {
        menu.put(item.getName(), item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menu.values().iterator();
    }
}
