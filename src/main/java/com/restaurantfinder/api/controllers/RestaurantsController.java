package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.ResourceTypes;
import com.restaurantfinder.api.exceptions.ResourceNotFoundException;
import com.restaurantfinder.api.models.Restaurant;
import com.restaurantfinder.api.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/restaurantfinder/restaurants")
public class RestaurantsController {

    private final RestaurantService _restaurantService;

    @Autowired
    public RestaurantsController(RestaurantService restaurantService) {
        this._restaurantService = restaurantService;
    }

    @CrossOrigin
    @GetMapping(path="/find-all")
    public @ResponseBody List<Restaurant> findAllRestaurants(){
        return this._restaurantService.findAllRestaurants();
    }

    @CrossOrigin
    @GetMapping(path="/find-one/name/{name}")
    public @ResponseBody Restaurant findRestaurantByName (@PathVariable("name") String name) {

        Restaurant restaurant = this._restaurantService.findByName(name);
        if(restaurant == null){
            throw new ResourceNotFoundException(ResourceTypes.RESTAURANT, name);
        }
        return restaurant;
    }

    @CrossOrigin
    @GetMapping(path="/find-one/id/{restaurantId}")
    public @ResponseBody Restaurant findRestaurantByRestaurantId (@PathVariable("restaurantId") String restaurantId) {
        Restaurant restaurant = this._restaurantService.findByRestaurantId(restaurantId);
        if(restaurant == null) {
            throw new ResourceNotFoundException(ResourceTypes.RESTAURANT, restaurantId);
        }
        return restaurant;
    }

    @CrossOrigin
    @GetMapping(path="find-many/borough/{borough}")
    public HttpEntity<List<Restaurant>> findRestaurantsByBorough(@PathVariable("borough") String borough){
        List<Restaurant> restaurants = this._restaurantService.findByBorough(borough);
        if(restaurants == null){
            throw new ResourceNotFoundException(ResourceTypes.RESTAURANT, borough);
        }
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path="find-many/cuisine/{cuisineType}")
    public HttpEntity<List<Restaurant>> findRestaurantsByCuisineType(@PathVariable("cuisineType") String cuisineType){
        List<Restaurant> restaurants = this._restaurantService.findByCuisine(cuisineType);
        if(restaurants == null) {
            throw new ResourceNotFoundException(ResourceTypes.RESTAURANT, cuisineType);
        }
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
}
