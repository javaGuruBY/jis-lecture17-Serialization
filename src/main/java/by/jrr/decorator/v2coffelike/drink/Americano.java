package by.jrr.decorator.v2coffelike.drink;

public class Americano extends Beverage {

    public Americano() {
        super(3.0);
        name = "Americano";
        description = "hot drink based on coffee";
    }

    @Override
    public double getCost() {
        return cost;
    }

}
