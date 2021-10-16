package factory.ingredientFactory;

import ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClams();
    public Pepperoni createPepperoni();
}
