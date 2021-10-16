package ui;

import model.Airplane;
import model.Bird;
import model.Cafe;
import model.Flyer;

public class FlyerDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
       Cafe cafeAirplane = new Airplane();
       Flyer flyer  = new Airplane();

        bird.fly();
        cafeAirplane.serveDrinks();

        FlyerDemo flyerDemo = new FlyerDemo();
        flyerDemo.lunchService(cafeAirplane);
        flyerDemo.lunchService(airplane);
        flyerDemo.firstPartOfFlight(airplane);
    }

    public void lunchService(Cafe c){
        c.serveDrinks();
        c.serveSnacks();
    }

    public void firstPartOfFlight(Airplane a){
        a.takeoff();
        a.serveDrinks();
    }
}
