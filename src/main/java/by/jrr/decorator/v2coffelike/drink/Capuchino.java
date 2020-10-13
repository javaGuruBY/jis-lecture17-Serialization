package by.jrr.decorator.v2coffelike.drink;

public class Capuchino extends Beverage {

    public Capuchino() {
        super(3.0);
        name = "Capuchino";
        description = "hot drink based on coffee";
    }

    @Override
    public double getCost() {
        return cost;
    }

}
