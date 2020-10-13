package by.jrr.decorator.v2coffelike.components;

import by.jrr.decorator.v2coffelike.drink.Beverage;

public abstract class BeverageComponent extends Beverage {
    Beverage beverage;

    public BeverageComponent(Double cost, Beverage beverage) {
        super(cost);
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return beverage.toString() +
                "\n"+
                String.format("\tCost of %s: %.2f",
                        this.getClass().getSimpleName(),
                        beverage.cost);
    }
}
