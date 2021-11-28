package com.restaurantfinder.api.models;

public class CuisineTypeRequest {

    private String cuisineType;

    public CuisineTypeRequest() {
    }

    public CuisineTypeRequest(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }
}
