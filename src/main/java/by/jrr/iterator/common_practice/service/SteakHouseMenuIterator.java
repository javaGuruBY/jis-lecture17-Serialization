package by.jrr.iterator.common_practice.service;

import by.jrr.iterator.common_practice.bean.MenuItem;

import java.util.Iterator;
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
