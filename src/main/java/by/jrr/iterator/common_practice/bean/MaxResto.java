package by.jrr.iterator.common_practice.bean;

import by.jrr.iterator.common_practice.service.CoffeLikeMenuService;
import by.jrr.iterator.common_practice.service.SteakHouseMenuService;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static by.jrr.iterator.before_refactoring.App.log;

public class MaxResto {

    static CoffeLikeMenuService coffeLike = new CoffeLikeMenuService();
    static SteakHouseMenuService steakHouse = new SteakHouseMenuService();

    public static void printCommonMenu() {
        List<Iterable<MenuItem>> menus = List.of(coffeLike, steakHouse);
        menus.stream()
                .map(Iterable::iterator)
                .forEach(a -> print(a));
    }

    private static void print(Iterator<MenuItem> menu) {
        while (menu.hasNext()) {
            MenuItem menuItem = menu.next();
            log.info(menuItem.toString());
        }
    }
}
