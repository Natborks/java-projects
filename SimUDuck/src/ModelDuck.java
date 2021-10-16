public class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Hey! I'm a Model Duck.");
    }
}
