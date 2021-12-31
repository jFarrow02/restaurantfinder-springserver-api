package com.restaurantfinder.api.repositories;

import com.mongodb.client.result.UpdateResult;
import com.restaurantfinder.api.models.CuisineType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CuisineTypeRepositoryImpl implements CuisineTypeRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<CuisineType> getCuisineTypes() {
        List<CuisineType> results = mongoTemplate.findAll(CuisineType.class, "cuisine-types");
        return results;
    }

    @Override
    public CuisineType getCuisineTypeByTypeName(String name) {
        Query query = new Query(Criteria.where("cuisineType").is(name));
        CuisineType result = mongoTemplate.findOne(query, CuisineType.class, "cuisine-types");
        return result;
    }

    @Override
    public CuisineType createCuisineType(String type) {
        String newId = Integer.toString(mongoTemplate.findAll(CuisineType.class, "cuisine-types").size());
        return mongoTemplate.save(new CuisineType(type, newId), "cuisine-types");
    }

    @Override
    public UpdateResult updateCuisineType(String cuisineId, CuisineType cuisineType) {
        Query query = new Query(Criteria.where("cuisineId").is(cuisineId));
        Update update = new Update();
        update.set("cuisineType", cuisineType.getCuisineType());
        UpdateResult result = mongoTemplate.updateFirst(query, update, "cuisine-types");
        return result;
    }
}
