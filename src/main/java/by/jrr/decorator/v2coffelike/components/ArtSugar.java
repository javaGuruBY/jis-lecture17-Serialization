package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public class ArtSugar extends BeverageComponent {
    String name = " with artificial sugar";

    public ArtSugar(Beverage beverage) {
        super(0.99, beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + cost;
    }
}
