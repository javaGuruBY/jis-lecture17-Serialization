package by.jrr.decorator.v1coffelike.bean.v1coffelike.bean;

public class Latte extends Beverage {
    
    @Override
    public double getCost() {
        double cost = super.getCost();
        cost += 7.0;
        return cost;
    }
}
