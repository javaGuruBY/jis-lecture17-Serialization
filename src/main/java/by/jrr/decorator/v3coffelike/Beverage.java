package by.jrr.decorator.v3coffelike;

public abstract class Beverage {

    protected String description = "";
    protected Double cost;

    protected Beverage beverage;

    public Beverage(Double cost, Beverage beverage) {
        this.cost = cost;
        this.beverage = beverage;
    }

    public Beverage(Double cost) {
        this.cost = cost;
        this.beverage = null;
    }

    public double getCost() {
        if (beverage == null) {
            return cost;
        } else {
            return beverage.getCost() + cost;
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();

        if (beverage == null) {
            result.append(String.format("\nBeverage %s %s\n\tCost of %s: %.2f",
                    this.getClass().getSimpleName(),
                    description, this.getClass().getSimpleName(),
                    cost));
        } else {
            result.append(beverage.toString() +
                    String.format("\n\tCost of %s: %.2f",
                            this.getClass().getSimpleName(),
                            cost));
        }
        return result.toString();
    }

    public final static void print(Beverage beverage) {
        System.out.println(beverage.toString());
        System.out.println("================");
        System.out.println(String.format("\tTotal: %.2f", beverage.getCost()));
    }

    public final static String check(Beverage beverage) {
        return beverage.toString() +
                "\n\t================" +
                String.format("\n\tTotal: %.2f", beverage.getCost());
    }
}
