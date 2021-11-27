package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Grade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends MongoRepository<Grade, String> {

    List<Grade> getGradesByRestaurantId(String restaurantId);
}
