package by.jrr.decorator.v2coffelike.drink;

public class Latte extends Beverage {
    public Latte() {
        super(3.0);
        name = "Latte";
        description = "hot drink based on coffee";
    }

    @Override
    public double getCost() {
        return cost;
    }

}
