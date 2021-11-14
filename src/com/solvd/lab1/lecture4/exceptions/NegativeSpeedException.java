package com.solvd.lab1.lecture4.exceptions;

public class NegativeSpeedException extends RuntimeException{
    @Override
    public String getMessage() {
        return ("The speed must be grater than 0");
    }
}
