package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.CuisineType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuisineTypeRepository {

    public List<CuisineType> getCuisineTypes();

    public CuisineType getCuisineTypeByTypeName(String name);

    public CuisineType createCuisineType(String type);

    public CuisineType updateCuisineType(String cuisineId, CuisineType cuisineType);
}
