package by.jrr.decorator.v1coffelike.bean.v1coffelike.bean;

public class Espresso extends Beverage {
    
    @Override
    public double getCost() {
        double cost = super.getCost();
        cost += 3.0;
        return cost;
    }
}
