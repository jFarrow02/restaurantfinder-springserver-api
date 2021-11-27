package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class GradeRepositoryImpl implements GradeRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Grade> getGradesByRestaurantId(String restaurantId) {
        Query query = new Query(Criteria.where("restaurantId").is(restaurantId));
        List<Grade> result = mongoTemplate.find(query, Grade.class);
        return result;
    }

    public Grade createGrade(Grade grade) {
        return mongoTemplate.insert(grade, "grades");
    }
}
