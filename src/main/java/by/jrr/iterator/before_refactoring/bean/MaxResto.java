package by.jrr.iterator.before_refactoring.bean;

import by.jrr.iterator.before_refactoring.App;
import by.jrr.iterator.before_refactoring.service.CoffeLikeMenuService;
import by.jrr.iterator.before_refactoring.service.SteakHouseMenuService;

import java.util.List;

import static by.jrr.iterator.before_refactoring.App.log;

public class MaxResto {

    static CoffeLikeMenuService coffeLike = new CoffeLikeMenuService();
    static SteakHouseMenuService steakHouse = new SteakHouseMenuService();

    public static void printCommonMenu() {
        MenuItem[] coffeeLikeMenu = coffeLike.getMenuItems();
        List<MenuItem> steakHouseMenu = steakHouse.getMenu();

        for(int i = 0; i < coffeeLikeMenu.length; i++) {
            log.info(coffeeLikeMenu[i].toString());
        }

        for (int i = 0; i < steakHouseMenu.size(); i++) {
            log.info(steakHouseMenu.get(i).toString());
        }
    }
}
