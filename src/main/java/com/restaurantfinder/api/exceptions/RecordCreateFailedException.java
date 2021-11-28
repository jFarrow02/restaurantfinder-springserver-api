package com.restaurantfinder.api.exceptions;

import com.restaurantfinder.api.ResourceTypes;

public class RecordCreateFailedException extends RuntimeException {

    public RecordCreateFailedException(ResourceTypes type) {
        super("Failed to create resource of type " + type);
    }
}
