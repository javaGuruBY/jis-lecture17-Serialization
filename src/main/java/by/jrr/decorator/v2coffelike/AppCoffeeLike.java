package by.jrr.decorator.v2coffelike;

import by.jrr.decorator.v2coffelike.components.Coffee;
import by.jrr.decorator.v2coffelike.components.Sugar;
import by.jrr.decorator.v2coffelike.drink.Beverage;
import by.jrr.decorator.v2coffelike.drink.Capuchino;
import by.jrr.decorator.v2coffelike.components.BeverageComponent;
import by.jrr.decorator.v2coffelike.components.Milk;
import by.jrr.decorator.v2coffelike.drink.Latte;

public class AppCoffeeLike {
    public static void main(String[] args) {
        Beverage latte = new Latte();
        BeverageComponent withSugar = new Sugar(latte);
        BeverageComponent withCoffee = new Coffee(withSugar);
        BeverageComponent withMilk = new Milk(withCoffee);
        Beverage.print(withMilk);
        System.out.println(Beverage.check(withMilk));
    }
}
