package com.solvd.lab1.lecture4.exceptions;

public class InvalidFormat extends InvalidLicensePlateException{
    @Override
    public String getMessage() {
        return "Invalid format in license plate";
    }
}
