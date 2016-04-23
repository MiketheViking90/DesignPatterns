package iterator;

import java.util.List;

import domain.MenuItem;

public class PancakeHouseIterator implements MenuIterator {

    private List<MenuItem> items;
    private int iteratorPos = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (iteratorPos >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(iteratorPos);
        iteratorPos++;
        return item;
    }
}
