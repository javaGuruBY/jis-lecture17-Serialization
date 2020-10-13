package by.jrr.decorator.v1coffelike.bean.v1coffelike.bean;

public class Mockachino extends Beverage {
    
    @Override
    public double getCost() {
        double cost = super.getCost();
        cost += 6.0;
        return cost;
    }
}
