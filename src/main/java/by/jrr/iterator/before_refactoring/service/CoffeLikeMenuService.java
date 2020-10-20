package by.jrr.iterator.before_refactoring.service;

import by.jrr.iterator.before_refactoring.bean.MenuItem;

import static by.jrr.iterator.before_refactoring.App.log;

public class CoffeLikeMenuService {
    private static final int MAX_ITEMS = 4;
    private MenuItem[] menuItems;
    private int numberOfItems = 0;

    public CoffeLikeMenuService() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("SIRLOIN STEAK", "Sirloin is one of the most popular steaks ", false, 9.45);
        addItem("NEW YORK STRIP", "A New York Strip steak is a particular cut of Top Sirloin", false, 10.45);
        addItem("ROUND STEAK", "steak from well-exercised muscles and consequently quite lean", false, 8.99);
        addItem("FLAT IRON STEAK", "a popular cut with near-perfect marbling that makes it second only to filet mignon in tenderness", false, 1.88);

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        if(numberOfItems >= MAX_ITEMS) {
            log.warn("No more items could be added to menu. Please, remove one");
        } else {
            menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
            numberOfItems++;
        }
    }
}
