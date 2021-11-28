package com.restaurantfinder.api.repositories;

import com.mongodb.client.result.UpdateResult;
import com.restaurantfinder.api.models.CuisineType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuisineTypeRepository {

    public List<CuisineType> getCuisineTypes();

    public CuisineType getCuisineTypeByTypeName(String name);

    public CuisineType createCuisineType(String type);

    public UpdateResult updateCuisineType(String cuisineId, CuisineType cuisineType);
}
