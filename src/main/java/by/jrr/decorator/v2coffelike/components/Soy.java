package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public class Soy extends BeverageComponent {
    String name = " with Soy";

    public Soy(Beverage beverage) {
        super(0.01, beverage);

    }

    @Override
    public double getCost() {

        return beverage.getCost() + cost;
    }

}
