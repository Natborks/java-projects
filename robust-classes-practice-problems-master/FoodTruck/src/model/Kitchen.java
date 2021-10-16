package model;

import model.exceptions.NoCookException;
import model.exceptions.NotEnoughIngredientsException;
import model.exceptions.NotEnoughMoneyException;

public class Kitchen {

    private final static int INGREDIENT_PER_TACO = 3;
    private final static int DOLLAR_PER_INGREDIENT = 2;
    private int ingredient;
    private int tacoCount;
    private int balance;
    private boolean cookReady;

    public Kitchen(int initialIngredient, int initialTaco, int balance, boolean cookStatus) {
        ingredient = initialIngredient;
        tacoCount = initialTaco;
        cookReady = cookStatus;
        this.balance = balance;
    }

    // getters
    public int getIngredientCount() { return ingredient; }
    public int getTacoCount() { return tacoCount; }
    public boolean getCookState() { return cookReady; }
    public int getBalance() { return balance; }

    public void setCookStatus(boolean b) {
        cookReady = b;
    }

    // MODIFIES: this
    // EFFECTS:  number is added to tacoCount, and ingredient is decremented accordingly
    public void makeTaco(int number) throws NoCookException, NotEnoughIngredientsException {
        if(!cookReady)
            throw new NoCookException("Cook not available");

        int totalIngredient = INGREDIENT_PER_TACO * number;

        if(ingredient < totalIngredient)
            throw new NotEnoughIngredientsException("Ingredients are not enough");

        ingredient -= (INGREDIENT_PER_TACO * number);

        tacoCount += number;
    }

    // MODIFIES: this
    // EFFECTS: (amount) is added to the ingredient field, and the balance field
    //          is decremented accordingly
    public void buyIngredients(int amount) throws NotEnoughMoneyException {
        int totalAmount = DOLLAR_PER_INGREDIENT * amount;

        if(balance < totalAmount)
            throw new NotEnoughMoneyException("Not enough money");

        balance -= totalAmount;
        ingredient += amount;
    }





}
