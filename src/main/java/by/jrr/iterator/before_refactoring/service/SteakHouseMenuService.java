package by.jrr.iterator.before_refactoring.service;

import by.jrr.iterator.before_refactoring.bean.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class SteakHouseMenuService {

    private List<MenuItem> menuItemList = new ArrayList<>();

    public SteakHouseMenuService() {
        menuItemList.addAll(List.of(
                new MenuItem("FILET MIGNON", "beef tenderloin or filet mignon is the most tender cut of beef", false, 5.45),
                new MenuItem("RIBEYE", "beauty steak or scotch fillet, rib eye is one of the most prized steaks", false, 5.09),
                new MenuItem("TOMAHAWK", "a cut of beef ribeye that has the whole rib bone attached, and it’s sometimes called a cowboy steak or bone-in ribeye", false, 6.45),
                new MenuItem("CHUCK EYE", "located very close to rib eye steaks and therefore shares many characteristics of a rib eye", false, 3.45)
        ));
    }

    public List<MenuItem> getMenu() {
        return menuItemList;
    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        menuItemList.add(new MenuItem(name, description, vegetarian, price));
    }
}

