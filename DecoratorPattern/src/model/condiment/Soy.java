package model.condiment;

import model.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.40;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + " with Soy";
    }
}
