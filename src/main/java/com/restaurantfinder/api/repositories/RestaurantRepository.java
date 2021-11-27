package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

    Restaurant findByName(String name);

    Restaurant findByRestaurantId(String restaurantId);

    List<Restaurant> findByBorough(String borough);

    List<Restaurant> findByCuisine(String cuisine);
}
