package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Restaurant;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository {

    @Query("{name: '?0'}")
    Restaurant findByName(String name);

    @Query("{restaurantId: '?0'}")
    Restaurant findByRestaurantId(String restaurantId);

    @Query("{borough: '?0'}")
    List<Restaurant> findByBorough(String borough);

    @Query("{cuisine: '?0'}")
    List<Restaurant> findByCuisine(String cuisine);

    @Query("{zipcode: '?0'}")
    List<Restaurant> findByZipcode(String zipcode);

    @Query("{: '?0'}")
    List<Restaurant> findByGrade(String grade);

    List<Restaurant> findAll();

}
