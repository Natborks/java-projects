package factory.pizzaFactory;

import factory.ingredientFactory.NYIngredientFactory;
import pizza.*;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CheesePizza(new NYIngredientFactory());
        } else return null;
    }
}
