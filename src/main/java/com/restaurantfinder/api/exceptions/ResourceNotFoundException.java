package com.restaurantfinder.api.exceptions;

import com.restaurantfinder.api.ResourceTypes;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(ResourceTypes type, String identifier) {
        super("Could not find resource type " + type + " identified by " + identifier);
    }
}
