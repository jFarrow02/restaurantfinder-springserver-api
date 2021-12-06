package com.restaurantfinder.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "zipcodes")
public class Zipcode {

    @Id
    private String id;

    @Field(name = "zip")
    private String zip;

    public Zipcode(String zip) {
        this.zip = zip;
    }

//    public String getId() {
//        return id;
//    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
