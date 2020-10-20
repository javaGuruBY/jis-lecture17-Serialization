package by.jrr.iterator.refactoring.service;

import by.jrr.iterator.refactoring.bean.Iterator;
import by.jrr.iterator.refactoring.bean.MenuItem;

public interface Iterable<T extends MenuItem> {
    Iterator<T> getMenuIterator();
}
