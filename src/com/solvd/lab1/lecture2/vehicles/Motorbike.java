package com.solvd.lab1.lecture2.vehicles;

import java.util.Objects;

public class Motorbike extends Vehicle{
    private String bikeType;

    public Motorbike(String licensePlate, String brand, float maxSpeed, String bikeType) {
        super(licensePlate, brand, maxSpeed);
        this.bikeType=bikeType;
    }

    public void wheelie(){
        System.out.println("The bike its doing wheelie, be careful");
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

}
