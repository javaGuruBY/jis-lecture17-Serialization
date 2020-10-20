package by.jrr.iterator.before_refactoring;

import by.jrr.iterator.before_refactoring.bean.MaxResto;
import by.jrr.iterator.before_refactoring.service.SteakHouseMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static final Logger log = LoggerFactory.getLogger("");

    public static void main(String[] args) {
        MaxResto.printCommonMenu();
    }
}
