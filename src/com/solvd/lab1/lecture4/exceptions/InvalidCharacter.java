package com.solvd.lab1.lecture4.exceptions;

public class InvalidCharacter extends InvalidLicensePlateException{
    @Override
    public String getMessage() {
        return "Invalid character in license plate";
    }
}
