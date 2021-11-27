package com.restaurantfinder.api.services;

import com.restaurantfinder.api.models.Restaurant;
import com.restaurantfinder.api.repositories.RestaurantRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepositoryImpl _restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepositoryImpl restaurantRepository){
        this._restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> findAllRestaurants() {
        return this._restaurantRepository.findAll();
    }

    public Restaurant findByName(String name){
        return this._restaurantRepository.findByName(name);
    }

    public List<Restaurant> findByBorough(String borough) {
        return this._restaurantRepository.findByBorough(borough);
    }

    public List<Restaurant> findByCuisine(String type) {
        return this._restaurantRepository.findByCuisine(type);
    }
}
