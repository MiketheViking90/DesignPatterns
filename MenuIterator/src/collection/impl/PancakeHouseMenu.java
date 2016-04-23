package collection.impl;

import java.util.ArrayList;
import java.util.List;

import domain.MenuItem;
import iterator.MenuIterator;
import iterator.PancakeHouseIterator;

public class PancakeHouseMenu extends Menu {

    private List<MenuItem> menu;

    public PancakeHouseMenu() {
        menu = new ArrayList<>();

        MenuItem pancakes = new MenuItem("pancakes",
                "pancakes with sausage and eggs",
                false,
                2.99);

        MenuItem bbPancakes = new MenuItem("blueberry pancakges",
                "panckaes made with blueberries",
                true,
                3.49);


        MenuItem waffles = new MenuItem("waffles",
                "waffles with choice of fruit",
                true,
                0);

        addItem(pancakes);
        addItem(bbPancakes);
        addItem(waffles);
    }

    @Override
    public void addItem(MenuItem item) {
        menu.add(item);
    }

    @Override
    public MenuIterator createIterator() {
        return new PancakeHouseIterator(menu);
    }
}
