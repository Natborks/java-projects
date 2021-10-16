package factory.pizzaFactory;

import pizza.Pizza;

import type.SimplePizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(String simplePizzaType){
        Pizza pizza = createPizza(simplePizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType);

}
