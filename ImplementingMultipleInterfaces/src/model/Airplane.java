package model;

public class Airplane implements Cafe, Flyer{
    @Override
    public void serveDrinks() {
        System.out.println("Serving Drinks");
    }

    @Override
    public void serveSnacks() {
        System.out.println("Serving Snacks");
    }

    @Override
    public void takeoff() {
        System.out.println("taking off");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void land() {
        System.out.println("landing");
    }
}
