package model;

public abstract class Doable {

    protected String description;

    public Doable(String description) {
        this.description = description;
    }

    abstract void display(String indentSpace);

    abstract boolean getStatus();

    abstract String getDescription();
}
