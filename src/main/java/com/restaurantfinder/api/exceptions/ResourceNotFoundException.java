package com.restaurantfinder.api.exceptions;

import com.restaurantfinder.api.ResourceTypes;

public class ResourceNotFoundException extends RuntimeException {

    private String resourceType;

    public ResourceNotFoundException(ResourceTypes type, String identifier) {
        super("Could not find resource type " + type + " identified by " + identifier);
    }
}
