package model;

public interface Flyer {
    //REQUIRES: Being on land
    //MODIFIES: this
    //EFFECTS: Moves this into the air
    public void takeoff();

    //REQUIRES: Being in the air
    //MODIFIES: this
    //EFFECTS: Moves this in the air
    public void fly();

    //REQUIRES: Being in the air
    //MODIFIES: this
    //EFFECTS: Moves this back unto the ground
    public void land();
}
