package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.ResourceTypes;
import com.restaurantfinder.api.exceptions.ResourceNotFoundException;
import com.restaurantfinder.api.models.CuisineType;
import com.restaurantfinder.api.services.CuisineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuisine-types")
public class CuisineTypeController {

    private CuisineTypeService _cuisineTypeService;

    @Autowired
    public CuisineTypeController(CuisineTypeService cuisineTypeService) {
        this._cuisineTypeService = cuisineTypeService;
    }

    @GetMapping("/find-all")
    public HttpEntity<List<CuisineType>> findAllCuisineTypes() {
        List<CuisineType> results = _cuisineTypeService.findAllCuisineTypes();
        if(results == null) {
            throw new ResourceNotFoundException(ResourceTypes.CUISINE_TYPE, "all");
        }
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
