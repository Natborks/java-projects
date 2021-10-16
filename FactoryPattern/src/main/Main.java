package main;

import factory.pizzaFactory.NYStylePizzaStore;
import factory.pizzaFactory.PizzaStore;
import pizza.Pizza;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");

        System.out.println(pizza);
    }
}
