package com.restaurantfinder.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="restaurants")
public class Restaurant {

    @Id
    private String id;

    @Field
    private String building;

    @Field
    private String street;

    @Field
    private double latitude;

    @Field
    private double longitude;

    @Field
    private String borough;

    @Field
    private String cuisine;

    @Field
    private String name;

    @Field
    private String restaurantId;

    @Field(name = "zipcode")
    private String zipcode;

    public Restaurant(String building, String street, double latitude, double longitude,
                      String borough, String cuisine, String name, String restaurantId, String zipcode) {
        this.building = building;
        this.street = street;
        this.latitude = latitude;
        this.longitude = longitude;
        this.borough = borough;
        this.cuisine = cuisine;
        this.name = name;
        this.restaurantId = restaurantId;
        this.zipcode = zipcode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
