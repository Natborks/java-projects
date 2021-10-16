package factory.ingredientFactory;

import ingredient.*;

public class NYIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies =  {
            new Garlic(),
            new Onion(),
            new Mushroom(),
            new Eggplant()
        };
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
