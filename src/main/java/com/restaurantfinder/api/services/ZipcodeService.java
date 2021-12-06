package com.restaurantfinder.api.services;

import com.restaurantfinder.api.models.Zipcode;
import com.restaurantfinder.api.repositories.ZipcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZipcodeService {

    @Autowired
    private ZipcodeRepository _zipcodeRepository;

    public List<Zipcode> findAllZipcodes() {
        return this._zipcodeRepository.findAllZipcodes();
    }
}
