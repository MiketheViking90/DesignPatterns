package iterator;

import domain.MenuItem;

public class DinerMenuIterator implements MenuIterator {

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
}
