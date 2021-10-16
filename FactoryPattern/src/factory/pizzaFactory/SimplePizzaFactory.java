package factory.pizzaFactory;

import pizza.ClamPizza;
import pizza.Pizza;
import type.SimplePizzaType;

public class SimplePizzaFactory {
    Pizza pizza;

    public Pizza createPizza(SimplePizzaType simplePizzaType){
        if(simplePizzaType == SimplePizzaType.CLAM)
            pizza = new ClamPizza();

        return pizza;
    }
}
