package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.ResourceTypes;
import com.restaurantfinder.api.exceptions.ResourceNotFoundException;
import com.restaurantfinder.api.models.Restaurant;
import com.restaurantfinder.api.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/restaurants")
public class RestaurantsController {

    private final RestaurantService _restaurantService;

    @Autowired
    public RestaurantsController(RestaurantService restaurantService) {
        this._restaurantService = restaurantService;
    }

    @GetMapping(path="/find-all")
    public @ResponseBody List<Restaurant> findAllRestaurants(){
        return this._restaurantService.findAllRestaurants();
    }

    @GetMapping(path="/find-one/name/{name}")
    public @ResponseBody Restaurant findRestaurantByName (@PathVariable("name") String name) {

        Restaurant restaurant = this._restaurantService.findByName(name);
        if(restaurant == null){
            throw new ResourceNotFoundException(ResourceTypes.RESTAURANT, name);
        }
        return restaurant;
    }

    @GetMapping(path="/find-one/id/{restaurantId}")
    public @ResponseBody Restaurant findRestaurantByRestaurantId (@PathVariable("restaurantId") String restaurantId) {
        return null;
    }

    @GetMapping(path="find-many/borough/{borough}")
    public @ResponseBody List<Restaurant> findRestaurantsByBorough(@PathVariable("borough") String borough){
        return null;
    }

    @GetMapping(path="find-many/cuisine/{cuisineType}")
    public @ResponseBody List<Restaurant> findRestaurantsByCuisineType(@PathVariable("cuisineType") String cuisineType){
        return null;
    }
}
