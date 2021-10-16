package model;

import ui.SelfDrivingCar;

public class AutoDriver {

    FrontSensor frontSensor;
    SpeedRegulator speedRegulator;

    public AutoDriver(SelfDrivingCar car) {
        frontSensor = car.getFrontSensor();
        speedRegulator = car.getSpeedRegulator();
    }

    // MODIFIES: SpeedRegulator
    // EFFECTS: for seconds iterations, slows down if too close to object in front
    public void driveForward(int seconds) {
        for (int i = 0; i < seconds; i+=1){
            if (frontSensor.tooClose())
                speedRegulator.slowDown();
        }
    }


}
