package by.jrr.iterator.refactoring.bean;

public interface Iterator<T extends MenuItem> {
    boolean hasNext();
    T next();
}
