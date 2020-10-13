package by.jrr.decorator.v3coffelike.component;

import by.jrr.decorator.v3coffelike.Beverage;

public class Coffee extends Beverage {

    public Coffee(Beverage beverage) {
        super(0.50, beverage);
    }
}
