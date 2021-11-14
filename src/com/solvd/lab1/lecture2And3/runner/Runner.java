package com.solvd.lab1.lecture2And3.runner;

import com.solvd.lab1.lecture2And3.vehicles.Car;
import com.solvd.lab1.lecture2And3.vehicles.Motorbike;
import com.solvd.lab1.lecture2And3.vehicles.Vehicle;
import com.solvd.lab1.lecture4.consoleInputs.ConsoleInputs;
import com.solvd.lab1.lecture4.exceptions.InvalidCharacter;

import java.util.logging.Level;
import java.util.logging.Logger;


//Final class The class cannot be inherited by other classes
public final class Runner {
    private final static Logger LOGGER1 = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {

        Car car1 = null;
        Car car2 = null;
        Car car3 = null;
        Motorbike moto1 = null;
        try {
            car1 = new Car("AA123AA", "Ford", 10, "Diesel");
            car2 = new Car("AJ987FR", "Tesla", 220, "Hybrid");
            car3 = new Car("AA123AA", "Fiat", 120, "Diesel");
        } catch (InvalidCharacter e) {
            e.printStackTrace();
        }

        try {
            moto1 = new Motorbike("BB456BB", "Suzuki", 130, "Cross");
        } catch (InvalidCharacter e) {
            e.printStackTrace();
        }


        LOGGER1.log(Level.INFO, "Task 1");
        moto1.run();
        moto1.wheelie();


        //Task 2 use toString, equals and hashcode
        LOGGER1.log(Level.INFO, "Task 2 to string, equals and hashcode.");

        LOGGER1.log(Level.INFO, moto1.toString());
        LOGGER1.log(Level.INFO, "Car1 its equals to car3? " + car1.equals(car3));
        LOGGER1.log(Level.INFO, "Car1 its equals to car2? " + car1.equals(car2));

        LOGGER1.log(Level.INFO, "Car1 hashcode: " + car1.hashCode() + " isn't equals to car2 hashcode: " + car2.hashCode());
        LOGGER1.log(Level.INFO, "Car1 hashcode: " + car1.hashCode() + " is equals to car3 hashcode: " + car3.hashCode());


        LOGGER1.log(Level.INFO, "Lecture 3");
        //Static Final attribute
        LOGGER1.log(Level.INFO, "The max speed on city is: " + Motorbike.MAX_SPEED_ON_CITY);
        //Final method
        car1.finalMethod();
        //Static method
        Vehicle.staticMethod();

    }
}
