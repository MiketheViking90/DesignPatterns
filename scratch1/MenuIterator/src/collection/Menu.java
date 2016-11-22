package collection;

import java.util.Iterator;

import domain.MenuItem;
import lombok.Getter;

public abstract class Menu {

    @Getter protected String name;

    public abstract void addItem(MenuItem item);

    public abstract Iterator<MenuItem> createIterator();

}
