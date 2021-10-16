package model.condiment;

import model.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.40;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }
}
