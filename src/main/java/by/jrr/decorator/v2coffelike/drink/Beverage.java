package by.jrr.decorator.v2coffelike.drink;

public abstract class Beverage {

    public String name;
    public String description;
    public Double cost;

    public Beverage(Double cost) {
        this.cost = cost;
    }

    public abstract double getCost();

    @Override
    public String toString() {
        return String.format("Beverage %s %s\n\tCost of %s: %.2f",
                name, description, name, cost);
    }

    public static void print(Beverage beverage) {
        System.out.println(beverage.toString());
        System.out.println("================");
        System.out.println(String.format("\tTotal: %.2f", beverage.getCost()));
    }

    public static String check(Beverage beverage) {
        return beverage.toString() +
        "\n\t================"+
        String.format("\n\tTotal: %.2f", beverage.getCost());
    }
}
