package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public class Chocolate extends BeverageComponent {
    String name = " with chocolate";

    public Chocolate(Beverage beverage) {
        super(0.75, beverage);

    }

    @Override
    public double getCost() {
        return beverage.getCost() + cost;
    }

}
