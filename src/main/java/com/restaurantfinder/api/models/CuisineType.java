package com.restaurantfinder.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class CuisineType {

    @Id
    private String id;

    @Field
    private String cuisineType;

    @Field
    private String cuisineId;

    public CuisineType(String id, String cuisineType, String cuisineId) {
        this.id = id;
        this.cuisineType = cuisineType;
        this.cuisineId = cuisineId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId;
    }
}
