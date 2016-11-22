package collection.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collection.Menu;
import domain.MenuItem;

public class PancakeHouseMenu extends Menu {

    private List<MenuItem> menu;

    public PancakeHouseMenu() {
        name = "PancakeHouseMenu";
        menu = new ArrayList<>();

        MenuItem pancakes = new MenuItem("pancakes",
                "pancakes with sausage and eggs",
                false,
                2.99);

        MenuItem bbPancakes = new MenuItem("blueberry pancakes",
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
    public Iterator<MenuItem> createIterator() {
        return menu.iterator();
    }
}
