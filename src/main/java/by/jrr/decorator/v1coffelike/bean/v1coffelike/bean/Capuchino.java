package by.jrr.decorator.v1coffelike.bean.v1coffelike.bean;

public class Capuchino extends Beverage {

    @Override
    public double getCost() {
        double cost = super.getCost();
        cost += 5.0;
        return cost;
    }
}
