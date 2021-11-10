package com.solvd.lab1.lecture2And3.vehicles;

import com.solvd.lab1.lecture2And3.interfaces.IStunts;

public class Motorbike extends Vehicle implements IStunts {
    private String bikeType;
    //Final Attribute
    public final static int maxSpeedOnCity = 60;

    public Motorbike(String licensePlate, String brand, float maxSpeed, String bikeType) {
        super(licensePlate, brand, maxSpeed);
        this.bikeType=bikeType;
    }

    @Override
    public void wheelie(){
        System.out.println("The bike its doing wheelie, be careful");
    }

    @Override
    public void jumpingRamp() {
        System.out.println("The biker is crazy and is jumping a ramp.");
    }

    @Override
    public void run() {
        System.out.println("The " +bikeType +" motorbike its running");
    }

    public void run(float speed){
        System.out.println("the motorbike is running at: " +speed +"km/h");
    }

    @Override
    public void stop() {
        System.out.println("The " +bikeType +" motorbike was stopped");
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", bikeType='" + bikeType + '\'';
    }
    @Override
    public void changeWheels(int wheels) {
        System.out.println("the motorbike has" +wheels +" new wheels");
    }



}
