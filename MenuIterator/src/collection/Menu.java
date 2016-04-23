package collection;

import java.util.Iterator;

import domain.MenuItem;

public abstract class Menu {

    public abstract void addItem(MenuItem item);

    public abstract Iterator<MenuItem> createIterator();
}
