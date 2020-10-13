package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public class Mocha extends BeverageComponent {
    String name = " with mocha";

    public Mocha(Beverage beverage) {
        super(0.01, beverage);
    }

    @Override
    public double getCost() {
        System.out.println(String
                .format("\tCost of %s: %.2f",
                        this.getClass().getName(),
                        cost));
        return beverage.getCost() + cost;
    }
}
