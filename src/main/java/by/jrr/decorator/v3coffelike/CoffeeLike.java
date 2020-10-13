package by.jrr.decorator.v3coffelike;

import by.jrr.decorator.v3coffelike.component.Coffee;
import by.jrr.decorator.v3coffelike.component.Milk;
import by.jrr.decorator.v3coffelike.component.Sugar;
import by.jrr.decorator.v3coffelike.drink.Latte;

public class CoffeeLike {
    public static void main(String[] args) {
        Beverage latte = new Latte();
        Beverage latteWithSugar = new Sugar(latte);
        Beverage latteWithSugarAndMilk = new Milk(latteWithSugar);

        Beverage.print(latteWithSugarAndMilk);

        Beverage coffee = new Coffee(null);
        Beverage coffeeWithSugar = new Sugar(coffee);
        Beverage coffeeWithSugarAndMilk = new Milk(coffeeWithSugar);

        Beverage.print(coffeeWithSugarAndMilk);
    }
}
