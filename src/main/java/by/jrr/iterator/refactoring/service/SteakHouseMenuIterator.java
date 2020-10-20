package by.jrr.iterator.refactoring.service;

import by.jrr.iterator.refactoring.bean.Iterator;
import by.jrr.iterator.refactoring.bean.MenuItem;

import java.util.List;

public class SteakHouseMenuIterator implements Iterator<MenuItem> {

    List<MenuItem> items;
    private int position = 0;

    public SteakHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items == null || position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
