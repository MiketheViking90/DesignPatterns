package collection.impl;

import domain.MenuItem;
import iterator.MenuIterator;

public abstract class Menu {

    public abstract void addItem(MenuItem item);

    public abstract MenuIterator createIterator();
}
