package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public class Coffee extends BeverageComponent {
    String name = " with coffee";

    public Coffee(Beverage beverage) {
        super(0.05, beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + cost;
    }

}
