package model.condiment;

import model.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.80;
    }

    @Override
    public String getDescription() {
       return beverage.getDescription() + " with Mocha";
    }
}
