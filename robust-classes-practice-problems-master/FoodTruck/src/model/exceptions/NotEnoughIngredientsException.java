package model.exceptions;

public class NotEnoughIngredientsException extends Exception{
    public NotEnoughIngredientsException() {
    }

    public NotEnoughIngredientsException(String message) {
        super(message);
    }
}
