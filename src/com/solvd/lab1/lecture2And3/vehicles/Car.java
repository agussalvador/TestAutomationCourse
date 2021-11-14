package com.solvd.lab1.lecture2And3.vehicles;

import com.solvd.lab1.lecture4.exceptions.InvalidCharacter;
import com.solvd.lab1.lecture4.exceptions.NegativeSpeedException;

public class Car extends Vehicle {

    private String engine;

    public Car(String licensePlate, String brand, float maxSpeed, String engine) throws NegativeSpeedException, InvalidCharacter {
        super(licensePlate, brand, maxSpeed);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void reverse() {
        System.out.println("The car its making reverse, use your rear-view mirrors");
    }

    //Override methods
    @Override
    public void run() {
        System.out.println("The " + engine + " car its running");
    }

    public void run(float speed) {
        System.out.println("the car is running at: " + speed + "km/h");
    }

    @Override
    public void stop() {
        System.out.println("The " + engine + " car was stopped");
    }

    @Override
    public void changeWheels(int wheels) {
        System.out.println("the car has" + wheels + " new wheels");
    }
}
