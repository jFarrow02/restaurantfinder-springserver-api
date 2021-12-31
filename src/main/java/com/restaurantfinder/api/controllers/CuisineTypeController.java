package com.restaurantfinder.api.controllers;

import com.mongodb.client.result.UpdateResult;
import com.restaurantfinder.api.ResourceTypes;
import com.restaurantfinder.api.exceptions.ResourceNotFoundException;
import com.restaurantfinder.api.models.CuisineType;
import com.restaurantfinder.api.models.CuisineTypeRequest;
import com.restaurantfinder.api.services.CuisineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurantfinder/cuisine-types")
public class CuisineTypeController {

    private final CuisineTypeService _cuisineTypeService;

    @Autowired
    public CuisineTypeController(CuisineTypeService cuisineTypeService) {
        this._cuisineTypeService = cuisineTypeService;
    }

    @CrossOrigin
    @GetMapping("/find-all")
    public HttpEntity<List<CuisineType>> findAllCuisineTypes() {
        List<CuisineType> results = _cuisineTypeService.findAllCuisineTypes();
        if(results == null) {
            throw new ResourceNotFoundException(ResourceTypes.CUISINE_TYPE, "all");
        }
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/find-one/name/{name}")
    public HttpEntity<CuisineType> findCuisineTypeByName(@PathVariable("name") String name) {
        System.out.println("name:" + name);
        CuisineType result = _cuisineTypeService.getCuisineTypeByTypeName(name);
        if(result == null) {
            throw new ResourceNotFoundException(ResourceTypes.CUISINE_TYPE, name);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/new")
    public HttpEntity<CuisineType> createCuisineType(@RequestBody CuisineTypeRequest request) {
        CuisineType result = _cuisineTypeService.createCuisineType(request.getCuisineType());
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
