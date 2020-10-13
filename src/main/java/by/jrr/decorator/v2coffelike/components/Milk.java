package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public class Milk extends BeverageComponent {
    String name = " with Milk";

    public Milk(Beverage beverage) {
        super(1.0, beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + cost;
    }

}
