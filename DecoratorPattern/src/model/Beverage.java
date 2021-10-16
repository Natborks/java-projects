package model;

public abstract class Beverage {

    public String description = "Unknown Beverage";

    public abstract double cost ();

    public String getDescription(){
        return description;
    };
}
