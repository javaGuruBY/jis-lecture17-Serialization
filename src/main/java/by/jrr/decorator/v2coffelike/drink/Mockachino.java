package by.jrr.decorator.v2coffelike.drink;

public class Mockachino extends Beverage {

    public Mockachino() {
        super(3.0);
        name = "Mockachino";
        description = "hot drink based on tea";
    }

    @Override
    public double getCost() {
        return cost;
    }

}
