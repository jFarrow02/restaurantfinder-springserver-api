package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Restaurant findByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        Restaurant result = mongoTemplate.findOne(query, Restaurant.class);
        return result;
    }

    public Restaurant findByRestaurantId(String restaurantId) {
        Query query = new Query(Criteria.where("restaurantId").is(restaurantId));
        Restaurant result = mongoTemplate.findOne(query, Restaurant.class);
        return result;
    };

    public List<Restaurant> findByBorough(String borough) {
        Query query = new Query(Criteria.where("borough").is(borough));
        List<Restaurant> results = mongoTemplate.find(query, Restaurant.class);
        return results;
    };

    public List<Restaurant> findByCuisine(String cuisine) {
        Query query = new Query(Criteria.where("borough").is(cuisine));
        List<Restaurant> results = mongoTemplate.find(query, Restaurant.class);
        return results;
    };

    public List<Restaurant> findAll() {
        List<Restaurant> results = mongoTemplate.findAll(Restaurant.class);
        return results;
    }
}
