package by.jrr.decorator.v3coffelike.component;

import by.jrr.decorator.v3coffelike.Beverage;

public class Milk extends Beverage {

    public Milk(Beverage beverage) {
        super(0.99, beverage);
    }
}
