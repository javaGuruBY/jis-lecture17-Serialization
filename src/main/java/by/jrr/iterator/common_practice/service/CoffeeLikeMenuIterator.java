package by.jrr.iterator.common_practice.service;

import by.jrr.iterator.common_practice.bean.MenuItem;

import java.util.Iterator;

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
