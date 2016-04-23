package collection.impl;

import domain.MenuItem;
import iterator.DinerMenuIterator;
import iterator.MenuIterator;

public class DinerMenu extends Menu {

    private static final int MAX_SIZE = 6;

    private MenuItem[] menu;
    private int numItems = 0;

    public DinerMenu() {
        menu = new MenuItem[MAX_SIZE];

        MenuItem coffee = new MenuItem("coffee",
                "Coffee with optional milk and sugar",
                true,
                2.19);

        MenuItem hotdog = new MenuItem("hotdog",
                "Hot dog with sauerkraut, relish, onions, and mustard",
                false,
                3.05);

        addItem(coffee);
        addItem(hotdog);
    }

    @Override
    public void addItem(MenuItem item) {
        if (numItems < MAX_SIZE) {
            menu[numItems] = item;
            numItems++;
        } else {
            System.err.println("No more room on the menu.");
        }
    }

    @Override
    public MenuIterator createIterator() {
        return new DinerMenuIterator(menu);
    }
}
