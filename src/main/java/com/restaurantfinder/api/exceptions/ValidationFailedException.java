package com.restaurantfinder.api.exceptions;

public class ValidationFailedException extends RuntimeException {

    public ValidationFailedException(String message){
        super(message);
    }
}
