package com.solvd.lab1.lecture4.exceptions;

public class InvalidLicensePlateException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid character";
    }
}
