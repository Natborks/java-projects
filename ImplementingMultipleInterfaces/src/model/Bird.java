package model;

public class Bird implements Flyer{
    @Override
    public void takeoff() {
        System.out.println("hopping hopping jump");
    }

    @Override
    public void fly() {
        System.out.println("glide and flap");
    }

    @Override
    public void land() {
        System.out.println("just land");
    }
}
