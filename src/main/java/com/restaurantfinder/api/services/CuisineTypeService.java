package com.restaurantfinder.api.services;


import com.mongodb.client.result.UpdateResult;
import com.restaurantfinder.api.models.CuisineType;
import com.restaurantfinder.api.repositories.CuisineTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuisineTypeService {

    private CuisineTypeRepository _cuisineTypeRepository;

    @Autowired
    public CuisineTypeService(CuisineTypeRepository cuisineTypeRepository) {
        this._cuisineTypeRepository = cuisineTypeRepository;
    }

    public List<CuisineType> findAllCuisineTypes() {
        return _cuisineTypeRepository.getCuisineTypes();
    }

    public CuisineType getCuisineTypeByTypeName(String name) {
        return _cuisineTypeRepository.getCuisineTypeByTypeName(name);
    }

    public CuisineType createCuisineType(String type) {
        return _cuisineTypeRepository.createCuisineType(type);
    }

    public UpdateResult updateCuisineType(String cuisineId, CuisineType cuisineType) {
        return _cuisineTypeRepository.updateCuisineType(cuisineId, cuisineType);
    }
}
