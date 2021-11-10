package com.solvd.lab1.lecture2And3.runner;

import com.solvd.lab1.lecture2And3.vehicles.Car;
import com.solvd.lab1.lecture2And3.vehicles.Motorbike;
import com.solvd.lab1.lecture2And3.vehicles.Vehicle;

//Final class The class cannot be inherited by other classes
public final class Runner {

    public static void main(String[] args) {

        Car car1 = new Car("AA123AA", "Ford", 145, "Diesel");
        Car car2 = new Car("AJ987FR", "Tesla", 220, "Hybrid");
        Car car3 = new Car("AA123AA", "Fiat", 120, "Diesel");

        Motorbike moto1 = new Motorbike("BB456BB", "Suzuki", 130, "Cross");

        System.out.println("-------------------------------");
        System.out.println("Task 1");
        moto1.run();
        moto1.wheelie();


        //Task 2 use toString, equals and hashcode
        System.out.println("-------------------------------");
        System.out.println("Task 2 to string, equals and hashcode.");
        System.out.println(moto1.toString());

        System.out.println("Car1 its equals to car2? " + car1.equals(car2));
        System.out.println("Car1 its equals to car3? " + car1.equals(car3));

        System.out.println("Car1 hashcode: " + car1.hashCode() + " isn't equals to car2 hashcode: " + car2.hashCode());
        System.out.println("Car1 hashcode: " + car1.hashCode() + " is equals to car3 hashcode: " + car3.hashCode());

        System.out.println("-------------------------------");
        System.out.println("Lecture 3");
        //Static Final attribute
        System.out.println("The max speed on city is: " + Motorbike.maxSpeedOnCity);
        //Final method
        car1.finalMethod();
        //Static method
        Vehicle.staticMethod();

    }
}
