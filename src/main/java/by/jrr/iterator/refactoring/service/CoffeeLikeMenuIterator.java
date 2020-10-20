package by.jrr.iterator.refactoring.service;

import by.jrr.iterator.refactoring.bean.Iterator;
import by.jrr.iterator.refactoring.bean.MenuItem;

public class CoffeeLikeMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    private int position = 0;

    public CoffeeLikeMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items == null || position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
