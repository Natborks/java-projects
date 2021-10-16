package pizza;

import factory.ingredientFactory.NYIngredientFactory;
import factory.ingredientFactory.PizzaIngredientFactory;


public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
	    this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "NY Style Sauce and Cheese Pizza";
		toppings.add("Grated Reggiano Cheese");
	}

    @Override
    public void prepare() {
        cheese = pizzaIngredientFactory.createCheese();
        sauce = pizzaIngredientFactory.createSauce();
        dough = pizzaIngredientFactory.createDough();
    }
}
