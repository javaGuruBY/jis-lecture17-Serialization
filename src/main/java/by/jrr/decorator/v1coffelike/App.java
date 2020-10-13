package by.jrr.decorator.v1coffelike;

import by.jrr.decorator.v1coffelike.bean.Beverage;
import by.jrr.decorator.v1coffelike.bean.Espresso;

public class App {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setChocolate(true);
        System.out.println(espresso.getCost());
    }
}
