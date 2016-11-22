package iterator;

import java.util.Iterator;

import domain.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int iteratorPos = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if ((iteratorPos > items.length) ||
                (items[iteratorPos] == null)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[iteratorPos];
        iteratorPos++;
        return item;
    }

    @Override
    public void remove() {
        if (iteratorPos == 0) {
            throw new IllegalStateException("Cannot remove an item when none have been added.");
        }

        boolean validIndexItem = (items[iteratorPos - 1] != null);
        if (validIndexItem) {
            for (int i = iteratorPos - 1; i < items.length; i++) {
                items[i] = items[i + 1];
            }
        }
        items[items.length - 1] = null;
    }
}
