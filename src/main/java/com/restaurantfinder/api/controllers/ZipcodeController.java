package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.ResourceTypes;
import com.restaurantfinder.api.exceptions.ResourceNotFoundException;
import com.restaurantfinder.api.models.Zipcode;
import com.restaurantfinder.api.services.ZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurantfinder/zipcodes")
public class ZipcodeController {

    @Autowired
    private ZipcodeService _zipcodeService;

    @GetMapping("/find-all")
    @CrossOrigin
    public HttpEntity<List<Zipcode>> fetchZipcodes() {
        List<Zipcode> results = this._zipcodeService.findAllZipcodes();
        if(results == null) {
            throw new ResourceNotFoundException(ResourceTypes.ZIPCODE, "all");
        }
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
