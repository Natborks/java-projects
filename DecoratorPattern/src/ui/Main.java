package ui;

import model.Beverage;
import model.DarkRoast;
import model.Expresso;
import model.condiment.Milk;
import model.condiment.Mocha;
import model.condiment.Soy;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " - " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        System.out.println(beverage1.getDescription() + " - " + beverage1.cost());

        System.out.println(beverage1.getClass());
    }
}
