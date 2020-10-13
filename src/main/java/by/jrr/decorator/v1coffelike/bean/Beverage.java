package by.jrr.decorator.v1coffelike.bean;

public abstract class Beverage {

    private String name;
    private String description;

    private boolean coffee;
    private boolean milk;
    private boolean chocolate;
    private boolean soy;
    private boolean mocha;

    public double getCost() {
        double cost = 0.0;
        if (hasChocolate()) {
            cost += 2.0;
        }
        if (hasMilk()) {
            cost += 2.0;
        }
        if (hasCoffee()) {
            cost += 2.0;
        }
        if (hasMocha()) {
            cost += 2.0;
        }
        if (hasSoy()) {
            cost += 2.0;
        }
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasCoffee() {
        return coffee;
    }

    public void setCoffee(boolean coffee) {
        this.coffee = coffee;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasChocolate() {
        return chocolate;
    }

    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
}
