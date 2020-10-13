package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public class Cinnamon extends BeverageComponent {
    String name = " with Cinnamon";

    public Cinnamon(Beverage beverage) {
        super(0.09, beverage);
    }

    @Override
    public double getCost() {

        return beverage.getCost() + cost;
    }

}
