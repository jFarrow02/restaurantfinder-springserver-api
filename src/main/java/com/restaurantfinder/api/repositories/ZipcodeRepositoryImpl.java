package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Zipcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZipcodeRepositoryImpl implements ZipcodeRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Zipcode> findAllZipcodes(){
        return mongoTemplate.findAll(Zipcode.class);
    }
}
