package by.jrr.iterator.refactoring.bean;

import by.jrr.iterator.before_refactoring.App;
import by.jrr.iterator.refactoring.service.CoffeLikeMenuService;
import by.jrr.iterator.refactoring.service.SteakHouseMenuService;

import java.util.List;

import static by.jrr.iterator.before_refactoring.App.log;

public class MaxResto {

    static CoffeLikeMenuService coffeLike = new CoffeLikeMenuService();
    static SteakHouseMenuService steakHouse = new SteakHouseMenuService();

    public static void printCommonMenu() {
        Iterator<MenuItem> coffeeLikeMenu = coffeLike.getMenuIterator();
        Iterator<MenuItem> steakHouseMenu = steakHouse.getMenuIterator();

        print(coffeeLikeMenu);
        print(steakHouseMenu);
    }

    private static void print(Iterator<MenuItem> menu) {
        while (menu.hasNext()) {
            MenuItem menuItem = menu.next();
            log.info(
                    menuItem.toString());
        }
    }
}
