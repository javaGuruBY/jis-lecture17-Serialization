package by.jrr.decorator.v3coffelike.component;

import by.jrr.decorator.v3coffelike.Beverage;

public class Sugar extends Beverage {

    public Sugar(Beverage beverage) {
        super(0.01, beverage);
    }
}
